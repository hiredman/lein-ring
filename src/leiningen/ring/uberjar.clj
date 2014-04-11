(ns leiningen.ring.uberjar
  (:use [leiningen.ring.util :only (ensure-handler-set!)]
        [leiningen.ring.server :only (add-server-dep)])
  (:require [leiningen.ring.jar :as jar]
            leiningen.uberjar))

(defn uberjar
  "Create an executable $PROJECT-$VERSION.jar file with dependencies."
  [project]
  (ensure-handler-set! project)
  (let [project (-> project add-server-dep)]
    (leiningen.uberjar/uberjar project)))
