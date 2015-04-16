(defproject node-cljs-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2755"]]

  ;;:node-dependencies [[source-map-support "0.2.8"]]

  :plugins [
            [lein-cljsbuild "1.0.4"]
            ;;[lein-npm "0.4.0"]
            ]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :compiler {
                :output-to "out-dev/node-cljs-demo.js"
                :output-dir "out-dev"
                :target :nodejs
                :optimizations :none
                :source-map true}}
              {:id "prod"
                :source-paths ["src"]
                :compiler {
                  :output-to "main.js"
                  :output-dir "out-prod"
                  :target :nodejs
                  :optimizations :simple
                  :pretty-print true }

            }

                ]})
