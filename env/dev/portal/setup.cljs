(ns portal.setup
  (:require [portal.shadow.remote :as shadow]))

(add-tap #'shadow/submit)

(comment
  (tap> ::foo))