(ns server.main
  (:require
   [taoensso.telemere.timbre :as log]
   [shadow.cljs.devtools.api :as shadow-api]
   [shadow.cljs.devtools.server :as shadow-server]))

(defn start-shadow! []
  (require 'shadow.cljs.devtools.server)
  (shadow-server/start!)
  (shadow-api/watch :browser))

(defn -main []
  (log/info "starting shadow")
  (start-shadow!))