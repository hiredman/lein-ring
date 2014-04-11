(ns leiningen.ring.jar
  (:use [leiningen.ring.util :only (compile-form ensure-handler-set! update-project)]
        [leiningen.ring.server :only (add-server-dep)])
  (:require [clojure.string :as str]
            leiningen.jar))

(defn jar
  "Create an executable $PROJECT-$VERSION.jar file."
  [project]
  (ensure-handler-set! project)
  (let [project (-> project add-server-dep)]
    (leiningen.jar/jar project)))
