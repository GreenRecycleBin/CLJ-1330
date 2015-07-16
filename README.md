# CLJ-1330 Reproduction Code

This code reproduces the [CLJ-1330 issue](http://dev.clojure.org/jira/browse/CLJ-1330").

## Issue Reproduction

1. `cd` to the `src` folder:

        $ cd src

2. Compile the Clojure source file using Clojure 1.6:

        $ lein repl

        clj-1330.core=> (compile 'clj-1330.core)
        clj-1330.core

3. Compile the Java source file:

        $ javac -cp ~/.m2/repository/org/clojure/clojure/1.6.0/clojure-1.6.0.jar:../target/base+system+user+dev/classes/ clj_1330/Test.java

4. Run the compiled Java class:

        $ java -cp ~/.m2/repository/org/clojure/clojure/1.6.0/clojure-1.6.0.jar:../target/base+system+user+dev/classes/:. clj_1330.Test
        BAM!
        BAM!

## Fix Reproduction

This issue is fixed in Clojure 1.7.

1. `cd` to the `src` folder:

        $ cd src

2. Update project.clj to use Clojure 1.7:

        :dependencies [[org.clojure/clojure "1.7.0"]]

3. Clean the project

        $ lein clean

4. Compile the Clojure source file using Clojure 1.6:

        $ lein repl

        clj-1330.core=> (compile 'clj-1330.core)
        clj-1330.core

5. Compile the Java source file:

        $ javac -cp ~/.m2/repository/org/clojure/clojure/1.6.0/clojure-1.6.0.jar:../target/base+system+user+dev/classes/ clj_1330/Test.java

6. Run the compiled Java class:

        $ java -cp ~/.m2/repository/org/clojure/clojure/1.6.0/clojure-1.6.0.jar:../target/base+system+user+dev/classes/:. clj_1330.Test
        BOOM!
        BAM!

Because the bug only happened at compile time for Clojure 1.6, you can use any
combination of Clojure 1.6/1.7 for step 5 and 6 above and still get the same
(correct) output.
