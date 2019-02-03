(defproject hellworld "0.1.0-SNAPSHOT"
  :description "helloworld"
  :url "helloworld"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :main helloworld.core

  :cljsbuild {:builds [
                       {:id "dev"
                        :source-paths ["src"]
                        :compiler {
                                   :output-to "resources/public/js/dev.js"
                                   :output-dir "resources/public/js/cljs-dev/"
                                   :optimizations :whitespace
                                   :pretty-print true}}
                       {:id "prod"
                        :source-paths ["src"]
                        :compiler {
                                   :output-to "resources/public/js/prod.js"
                                   :output-dir "resources/public/js/cljs-prod/"
                                   :optimizations :whitespace
                                   :pretty-print false}}
                       ]
              }

  :plugins [
            [lein-cljsbuild "1.1.7"]
            ]

  :dependencies [
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.10.516"]
                 [reagent "0.8.1"]
                 ]

  )
