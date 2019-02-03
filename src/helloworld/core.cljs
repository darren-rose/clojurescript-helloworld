(ns helloworld.core
  (:require [reagent.core :as reagent]))

(def app-state
  (reagent/atom {
                 :inc-message "increment"
                 :dec-message "decrement"
                 :clicks 0
                 }))

(defn decrementer [message]
  [:div {}
   [:input {
            :type "button"
            :value message
            :on-click (fn [] (swap! app-state assoc-in [:clicks]  (if (> (:clicks @app-state) 0) (- (:clicks @app-state) 1) 0) ))
            }
    ]])

(defn incrementer [message]
      [:div {}
       [:input {
                :type "button"
                :value message
                :on-click (fn [] (swap! app-state assoc-in [:clicks] (+ (:clicks @app-state) 1) ))
                }
        ]])

(defn app []
  [:div {:class "app"}
   [incrementer (:inc-message @app-state)]
   [decrementer (:dec-message @app-state)]
   [:div {}  "clicks " (:clicks @app-state)]
   ]
  )

(reagent/render [app] (js/document.querySelector "#root"))
