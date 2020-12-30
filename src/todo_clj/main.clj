(ns todo-clj.main
  (:require [todo-clj.core :as core]
            [todo-clj.db :as db])
  (:gen-class))

(defn -main [& {:as args}]
  (db/migrate) ;; サーバー起動前にマイグレーションを行う
  (core/start-server
    :host (get args "host") :port (get args "port") :join? true))
