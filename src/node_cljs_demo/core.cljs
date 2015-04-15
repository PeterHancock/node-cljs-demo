(ns node-cljs-demo.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(def ^{:private true} mustache (nodejs/require "mustache"))

(defn fn [] (println "A Node library function transpiled form ClojureScript"))

(defn fn2 [] (println (.render mustache "ab{{c}}" #js{:c "C"})))

(defn ex [] (throw (js/Error. "Doh!")))

(defn -main []
  (println "A Node App transpiled from ClojureScript"))

(set! *main-cli-fn* #()) ;; -main a node app

(aset js/module "exports" #js { :fn fn :fn2 fn2 :ex ex :mustache mustache})
