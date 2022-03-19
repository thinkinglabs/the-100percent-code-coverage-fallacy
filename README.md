# the-100percent-code-coverage-fallacy [![Build Status](https://travis-ci.org/thinkinglabs/the-100percent-test-coverage-fallacy.svg?branch=master)](https://travis-ci.org/thinkinglabs/the-100percent-code-coverage-fallacy) [![Coverage Status](https://coveralls.io/repos/github/thinkinglabs/the-100-percent-code-coverage-fallacy/badge.svg?branch=master)](https://coveralls.io/github/thinkinglabs/the-100-percent-code-coverage-fallacy?branch=master)

This is the companion repo for the article [The Fallacy of the 100% code coverage](https://thinkinglabs.io/articles/2022/03/19/the-fallacy-of-the-100-code-coverage.html).

It showcases a system having 100% code coverage (as you can see from the coverage badge) using low-quality testing through [Assertion Free Tests](https://martinfowler.com/bliki/AssertionFreeTesting.html).

The system is an implementation of the [FizzBuzz Kata](http://codingdojo.org/kata/FizzBuzz/). It was grown using TDD. Once fully implemented, I removed all assertions (see [FizzBuzzTest](./src/test/java/io/thinkinglabs/FizzBuzzTest.java)). The system still has 100% code coverage. But when running the mutation tests none of the mutations is killed, resulting in zero useful tests.

| Number of Classes | Line Coverage | Mutation Coverage |
| ------------------|---------------|-------------------|
| 1 | 100% 12/12 | 0% 0/14 |

## Prerequisites

The system requires a JVM 1.8.

(_I'm a bit lazy to upgrade to the latest JVM. Pull requests are welcome :D_)

Installation on macos:

- Install [`jenv`](https://github.com/jenv/jenv) for managing JVMs.

  ```bash
  $ brew install jenv
  $ jenv doctor
  [OK] No JAVA_HOME set
  [OK] Java binaries in path are jenv shims
  [OK] Jenv is correctly loaded
  jenv enable-plugin export
  # restart your shell
  ```

- Install Java8

   ```bash
   brew install --cask temurin8
   jenv add /Library/Java/JavaVirtualMachines/temurin-8.jdk/Contents/Home/
   ```

## Code Coverage report

The code coverage is measured using [JaCoCo](http://www.eclemma.org/jacoco/).

To obtain a code coverage report:

```bash
./gradlew test jacocoTestReport
```

The coverage report can be found at `build/reports/jacoco/test/html/index.html`

## Mutation Testing report

The mutation testing is done using [PIT](http://pitest.org/).

To obtain a mutation testing report:

```bash
./gradlew pitest
```

The build will fail because not 100% of the mutations were killed. In the report you will see that the code coverage dropped to 0%.

The mutation testing report can be found at `build/reports/pitest/YYYYMMddhhmm/index.html`
