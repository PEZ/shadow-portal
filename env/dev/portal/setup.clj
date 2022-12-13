(ns portal.setup
  (:require [portal.api :as portal]))

(def !state (atom {:portal nil}))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn start! []
  (swap! !state assoc :portal (portal/open (merge {:launcher :vs-code})))
  (add-tap #'portal/submit))

(comment
  (tap> ::foo))