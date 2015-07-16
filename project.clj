(defproject clj-1330 "0.1.0-SNAPSHOT"
  :description "Code to reproduce CLJ-1330 issue"
  :url "http://dev.clojure.org/jira/browse/CLJ-1330"
  :license {:name "GNU General Public License v3.0"
            :URL "https://www.gnu.org/licenses/gpl-3.0.txt"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot clj-1330.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
