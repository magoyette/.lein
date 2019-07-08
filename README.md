# profiles.clj

My Leiningen user profile.

Includes the following plugins:
- [clj-kondo](https://github.com/borkdude/clj-kondo): A linter for Clojure. Run with `lein clj-kondo --lint src`.
- [lein-ancient](https://github.com/xsc/lein-ancient): Find outdated dependencies in projects and profiles.clj. Run `lein ancient` to verify the dependencies of a project and `lein ancient check-profiles` to verify the dependencies in `.lein`.
- [lein-kibit](https://github.com/jonase/kibit): Runs the static code analyzer kibit. Run with `lein kibit`.
- [lein-test-refresh](https://github.com/jakemcc/lein-test-refresh): Automatically refresh and run clojure.test tests. Run with `lein test-refresh`.
- [jonase/eastwood](https://github.com/jonase/eastwood): A linter for Clojure. Run with `lein eastwood`.
