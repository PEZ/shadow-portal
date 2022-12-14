(ns portal.setup
  (:require [portal.api :as portal]))

(def !state (atom {:p nil}))

(defn can-meta? [value]
  (instance? clojure.lang.IObj value))

(defn submit [value]
  (portal/submit
   (cond
     (:portal.nrepl/eval (meta value)) value
     (can-meta? value) (with-meta value {:portal.viewer/default :portal.viewer/tree})
     :else value)))

(defn start! [extra-config]
  (swap! !state assoc :p (portal/open (merge {}
                                             extra-config)))
  (add-tap #'submit))

(comment
  (start! {:launcher :vs-code})
  (add-tap #'portal/submit)
  (tap> {:launcher :vs-code})
  (tap> :foo)
  )