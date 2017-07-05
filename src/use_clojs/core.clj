(ns use-clojs.core
  (:require [clojs.clojs :refer [convert convert-string] :as cj])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (convert-string "(def a 1)"))
  (convert "all.clj" "fact.clj"))
