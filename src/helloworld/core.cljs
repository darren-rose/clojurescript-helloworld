(ns helloworld.core
  (:require [reagent.core :as reagent]))

(def app-state
  (reagent/atom {
                 :message "clicks"
                 :clicks 0
                 }))

(defn clickable [message]
  [:div {}
   [:div {:on-click (fn [] (swap! app-state assoc-in [:clicks] (+ (:clicks @app-state) 1) ))} message]])

(defn app []
  [:div {:class "app"}
   [clickable (:message @app-state)]
   [:div {} (:clicks @app-state)]
   ]
  )

(reagent/render [app] (js/document.querySelector "#root"))
