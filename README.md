
https://github.com/clojure/clojurescript/wiki/Quick-Start

https://github.com/swannodette/mies-node-template



DEV INSTALL
-------

```
lein npm install
lein cljsbuild auto
```


ClojureScript REPL
----

https://github.com/clojure/clojurescript/wiki/Quick-Start#nodejs-repl

```
scripts/repl
scripts/repl.clj
```

To run do

```
scripts/repl
```

```clojure
(require '[node-cljs-demo.core :as core] :reload)
(core/fn)
(core/ex)
```

Node REPL
---------

```bash
node
```
```javascript
var core = require('run.js');
core.fn();
core.ex();
```
