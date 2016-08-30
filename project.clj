(defproject todo-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.5.3"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.5.0"]
                 [compojure "1.5.1"]
                 [hiccup "1.0.5"]
                 [environ "1.1.0"]
                 [org.clojure/java.jdbc "0.6.2-alpha3"]
                 [org.postgresql/postgresql "9.4-1205-jdbc42"]
                 [bouncer "1.0.0"]
                 [ring/ring-defaults "0.2.1"]
                 [metosin/ring-http-response "0.8.0"]
                 [slingshot "0.12.2"]
                 [potemkin "0.4.3"]]
  :plugins [[lein-environ "1.1.0"]]
  :uberjar-name "todo-clj.jar"
  :profiles
  {:dev {:source-paths ["src" "test"]
         :dependencies [[prone "1.1.1"]]
         :env {:dev "true"
               :db "postgresql://todo_clj_dev_user:@localhost:5432/todo_clj_dev"}}
   :uberjar {:aot :all
             :main todo-clj.main}})
