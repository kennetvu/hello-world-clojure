(ns hello-world.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as routes]))

(defroutes app-routes
  (GET "/" [] "Hello worldss")
  (routes/resources "/")
  (routes/not-found "Not-found"))

(def app
  (handler/site app-routes))
