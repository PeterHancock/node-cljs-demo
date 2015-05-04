(defproject node-cljs-demo "0.1.0-SNAPSHOT"
  :description "Let's create a node module"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2755"]]

  :plugins [ [lein-cljsbuild "1.0.4"] ]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src/cljs"]
              :compiler {
                :output-to "out-dev/index.js"
                :output-dir "out-dev"
                :target :nodejs
                :optimizations :none
                :source-map true
                }
            }
            {:id "release"
              :source-paths ["src/cljs"]
              :compiler {
                :output-to "index.js"
                :target :nodejs
                :optimizations :simple
                :pretty-print true
              }
            }]
    }
)
