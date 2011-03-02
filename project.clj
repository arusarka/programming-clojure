(defproject programming-clojure "1.3.0"
  :description "Examples from Programming Clojure"
  :aot [examples.tasklist]
  :dependencies [[org.clojure/clojure
                  "1.3.0-master-SNAPSHOT"]
                 [org.clojure.contrib/standalone
                  "1.3.0-SNAPSHOT"]
                 [ring "0.3.6" :exclusions [org.clojure/clojure-contrib]]
                 [jline
                  "0.9.94"]
                 [hsqldb
                  "1.8.0.10"]]
  :repositories {"clojure-releases" "http://build.clojure.org/releases"})
