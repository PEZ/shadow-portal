(ns main.core-test
  (:require [cljs.test :refer [is deftest]]))

(deftest foo
  (tap> {:from ::cljs})
  (is (= :foo :foo)))

(deftest bar
  (is (= :bar :baz)))

(comment
  (cljs.test/run-tests 'main.core-test)
  :rcf)

