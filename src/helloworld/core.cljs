(ns helloworld.core
  (:require [reagent.core :as reagent]))

(def app-state
  (reagent/atom {
                 :inc-message "click me to increment"
                 :dec-message "click me to decrement"
                 :clicks 0
                 }))

(defn incrementer [message]
  [:div {}
   [:div {:on-click (fn [] (swap! app-state assoc-in [:clicks] (+ (:clicks @app-state) 1) ))} message]])

(defn decrementer [message]
  [:div {}
   [:div {:on-click (fn [] (swap! app-state assoc-in [:clicks] (- (:clicks @app-state) 1) ))} message]])

(defn app []
  [:div {:class "app"}
   [incrementer (:inc-message @app-state)]
   [decrementer (:dec-message @app-state)]
   [:div {} (:clicks @app-state)]
   ]
  )

(reagent/render [app] (js/document.querySelector "#root"))
