(ns hello-world.core2)

(defn handler [request]
  {:status 200
   :headers {"Content-type" "text/plain"}
   :body "Hello ring, Am I reloadable? yes"})
