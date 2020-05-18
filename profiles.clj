{:user {:dependencies [[clj-kondo "RELEASE"]]
        :aliases {"clj-kondo" ["run" "-m" "clj-kondo.main"]}
        :plugins [[com.jakemccrary/lein-test-refresh "0.24.1"]
                  [lein-ancient "0.6.15"]
                  [lein-kibit "0.1.8"]
                  [jonase/eastwood "0.3.10"]]}}
