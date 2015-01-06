(ns rest-skeleton.core
  (:require [compojure.core :refer :all]
            [clojure.data.json :as json]
            [ring.middleware.params :as middleware]))

(defn json-response [data & [status]]
  {:status (or status 200)
   :headers {"Content-Type" "application/json"}
   :body (json/write-str data)})

(defroutes handler
  (GET "/" []
       (json-response {:hello "world"}))
  (POST "/" [name]
        (json-response {:hello name})))

(def app
  (->
   handler
   middleware/wrap-params))
