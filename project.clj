(defproject lein-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[binaryage/devtools "1.0.6"]
                 [org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.11.60"]
                 [reagent "1.1.1"]
                 [thheller/shadow-cljs "2.20.4"]]
  :source-paths ["src" "test" "env/dev"]
  :main ^:skip-aot main.server
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             :portal {:dependencies [[djblue/portal "0.35.0"]]}})