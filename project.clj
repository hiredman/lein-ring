(defproject com.thelastcitadel/lein-ring "0.0.1-SNAPSHOT"
  :description "Leiningen Ring plugin"
  :url "https://github.com/hiredman/lein-ring"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/data.xml "0.0.6"]
                 [leinjacker "0.4.1"]
                 [ring/ring-servlet "1.2.2"]
                 [javax.servlet/servlet-api "2.5"]]
  :java-source-paths ["java"]
  :eval-in-leiningen true
  :javac-options ["-target" "1.6" "-source" "1.6"]
  )
