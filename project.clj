(defproject todo-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.5.0"]
                 [compojure "1.5.1"]
                 [hiccup "1.0.5"]
                 [environ "1.0.3"]]
  :plugins [[lein-environ "1.0.3"]]
  :profiles
  {:dev {:source-paths ["src" "test"]
         :dependencies [[prone "1.1.1"]]
         :env {:dev "true"}}})
