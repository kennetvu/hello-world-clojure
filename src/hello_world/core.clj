(ns hello-world.core
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
  {:status 200
   :headers {"Content-type" "text/plain"}
   :body "Hello Clojure, Hello Ring"})

(defn my-ip-handler [request]
  {:status 200
   :headers {"Content-type" "text/plain"}
   :body (:remote-addr request)})

(defn -main []
  (jetty/run-jetty my-ip-handler {:port 3000}))
