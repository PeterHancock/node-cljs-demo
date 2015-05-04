#!/bin/bash

echo "Building nodejs module from $npm_package_cljs_namespace namespace"

lein cljsbuild once release

echo "module.exports=$npm_package_cljs_namespace;" >> index.js
