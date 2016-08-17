(ns server-api.core
  (:use
     [compojure.handler :only [site]]
     [compojure.core :only [defroutes GET POST DELETE ANY context]]
     org.httpkit.server))

(defroutes all-routes
  (GET "/" [] "<p>Page not found.</p>"))

(defn -main []
  (do
    (println "Server start")
    (run-server (site all-routes) {:port 8080})))
