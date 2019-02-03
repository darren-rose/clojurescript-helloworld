(ns helloworld.core)


(defn multiply [x y]
  (* x y)
  )

(defn say-hello []
  #?(:clj (println "Clojure 15 * 6 =" (multiply 15 6))
     :cljs (js/console.log "Clojurescript 15 * 6 =" (multiply 15 6) ))
  )

(say-hello)