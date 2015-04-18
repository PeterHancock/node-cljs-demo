#!/bin/bash

(echo '(function(){'; tail -n +2 out-release/node-cljs-demo.js; echo ';module.exports=node_cljs_demo.core;})();') > index.js
