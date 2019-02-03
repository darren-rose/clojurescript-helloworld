(ns helloworld.core-test
  (:require [clojure.test :refer :all]
            [helloworld.core :refer :all]))

(deftest sanity-test
  (testing "value of 1"
    (is (= 1 1))))

(deftest multiply-test
  (testing "multiple 5 * 7"
    (is (= 35 (multiply 5 7)))))
