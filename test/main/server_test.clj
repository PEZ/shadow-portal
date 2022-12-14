(ns main.server-test
  (:require [clojure.test :refer [is deftest]]))

(deftest foo
  (tap> {:from ::clj})
  (is (= :foo :foo)))

(deftest bar
  (is (= :bar :baz)))

(comment
  (clojure.test/run-tests 'main.server-test)
  :rcf)
