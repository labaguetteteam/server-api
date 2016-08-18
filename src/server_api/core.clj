(ns server-api.core
  (:use
     [compojure.handler :only [site]]
     [compojure.core :only [defroutes GET POST DELETE ANY context]]
     org.httpkit.server))

(defroutes all-routes
  (GET "/" [] "<p>Welcome to / felow clojurer</p>"))

(defn -main []
  (do
    (println "Server start")
    (run-server (site all-routes) {:port 8080})))
