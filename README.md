
# Execution

Change toolchains.xml to match your Java 1.8 and Java 11 installation locations, the current should work if your using a Mac with Java 1.8.0 update 192 and Java 11.0.5.
```
$ /mvnw -t toolchains.xml clean verify
```

# Expected output;
I would expect something the following classes to be created;
```
target/classes/com/github/nhojpatrick/issue/BaseClass.class
target/classes/META-INF/versions/11/com/github/nhojpatrick/issue/BaseClass.class
target/classes/META-INF/versions/11/com/github/nhojpatrick/issue/NewClass.class
target/classes/META-INF/versions/11/module-info.class
target/test-classes/com/github/nhojpatrick/issue/BaseClassTest.class
target/test-classes/META-INF/versions/11/com/github/nhojpatrick/issue/BaseClassOverrideByJava11VersionTest.class
target/test-classes/META-INF/versions/11/com/github/nhojpatrick/issue/NewClassTest.class
```

# Expected Tests
I would expect 3 tests to be executed and all pass;

The following tests to be executed with a Java 1.8 jvm;
```
com.github.nhojpatrick.issue.BaseClassTest.baseClassTest_java8
```

I would expect the following tests to be executed within a Java 11 jvm;
```
com.github.nhojpatrick.issue.BaseClassOverrideByJava11VersionTest.baseClassTest_java11
com.github.nhojpatrick.issue.NewClassTest.newClassTest_java11
```

If this test executes within a Java 11 jvm it will fail;
```
com.github.nhojpatrick.issue.BaseClassTest.baseClassTest_java8
```
