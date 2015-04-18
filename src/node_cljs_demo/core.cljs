(ns node-cljs-demo.core
  (:require [cljs.nodejs :as node]))

(node/enable-util-print!)

(defn fun [] "A Node module function transpiled form ClojureScript")


(def render (let [mustache (node/require "mustache")]
            (fn [t v] (. mustache render t v))
        )
)

(defn ex [] (throw (js/Error. "Doh!")))

(defn -main [] nil)

(set! *main-cli-fn* #( )) ;; -main a node app
