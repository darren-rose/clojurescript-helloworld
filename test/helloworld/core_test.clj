(ns helloworld.core-test
  (:require [clojure.test :refer :all]
            ))

(deftest sanity-test
  (testing "value of 1"
    (is (= 1 1))))
