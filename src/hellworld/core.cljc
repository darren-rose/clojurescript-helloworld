(ns hellworld.core)


(defn multiply [x y]
  (* x y)
  )

(defn say-hello []
  #?(:clj (println "Clojure 5 * 6 =" (multiply 5 6))
     :cljs (js/console.log "Clojurescript 5 * 6 =" (multiply 5 6) ))
  )

(say-hello)