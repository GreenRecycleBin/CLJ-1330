(ns clj-1330.core
  (:gen-class
   :name com.example.Bug
   :methods [#^{:static true} [reproduce [] void]]))

(defn f [] (println "BOOM!"))
(def g (fn f [] (println "BAM!")))

(defn -reproduce []
  (f)
  (g))
