try {
    require("source-map-support").install();
} catch(err) {
}
require("./out-dev/goog/bootstrap/nodejs.js");
require("./out-dev/node-cljs-demo.js");
goog.require("node_cljs_demo.core");
goog.require("cljs.nodejscli");

module.exports = node_cljs_demo.core;
