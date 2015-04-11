(ns node-cljs-demo.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn fn [] (println "A Node library function transpiled form ClojureScript"))

(defn ex [] (throw (js/Error. "Doh!")))


(defn -main []
  (println "A Node App transpiled from ClojureScript"))

(set! *main-cli-fn* #()) ;; -main a node app
