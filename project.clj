(defproject org.cyverse/authy "3.0.1"
  :description "An OAuth 2.0 client clibrary written in Clojure."
  :url "https://github.com/cyverse-de/authy"
  :license {:name "BSD Standard License"
            :url "https://cyverse.org/license"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :plugins [[jonase/eastwood "1.4.3"]
            [lein-ancient "0.7.0"]
            [test2junit "1.4.4"]]
  :dependencies [[org.clojure/clojure "1.11.3"]
                 [org.clojure/tools.logging "1.3.0"]
                 [clj-http "3.13.0"]
                 [slingshot "0.12.2"]])
