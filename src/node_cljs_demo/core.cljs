(ns node-cljs-demo.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn fn [] (println "A Node library function transpiled form ClojureScript"))


(def fn2 (let [mustache (nodejs/require "mustache")]
            (fn [] (println (. mustache render "ab{{c}}" #js{:c "C"})))
        )
)

(defn ex [] (throw (js/Error. "Doh!")))

(defn -main []
  (println "A Node App transpiled from ClojureScript"))

(set! *main-cli-fn* #( )) ;; -main a node app

(comment aset js/module "exports" #js { :fn fn :fn2 fn2 :ex ex })
