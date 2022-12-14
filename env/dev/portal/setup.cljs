(ns portal.setup
  (:require [portal.shadow.remote :as shadow]))

(defn submit [value]
  (shadow/submit
   (cond
     (:portal.nrepl/eval (meta value)) value
     (implements? IWithMeta value) (with-meta value {:portal.viewer/default :portal.viewer/tree})
     :else value)))

(add-tap #'submit)

(comment
  (shadow/get-port)
  (tap> :foo))