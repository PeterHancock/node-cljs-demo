
lein cljsbuild once prod

(echo '(function(){'; tail -n +2 main.js; echo ';module.exports=node_cljs_demo.core;})();') > index.js
