(defproject rest-skeleton "REST service skeleton"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.json "0.2.5"]
                 [ring "1.3.2"]
                 [compojure "1.3.1"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler rest-skeleton.core/app})
