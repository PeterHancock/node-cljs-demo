;;https://github.com/clojure/clojurescript/wiki/Quick-Start#nodejs-repl
(require 'cljs.repl)
(require 'cljs.closure)
(require 'cljs.repl.node)

(cljs.repl/repl (cljs.repl.node/repl-env)
:watch "src"
:output-dir "out")
