(defproject browser-testing "0.1.0-SNAPSHOT"
  :profiles {:dev {:dependencies [[clj-webdriver "0.6.0"]]}}
  :test-selectors {:default (complement :browser)
                   :browser :browser})
