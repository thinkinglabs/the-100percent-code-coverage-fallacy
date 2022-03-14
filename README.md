# The Fallacy of the 100% code coverage [![Build Status](https://travis-ci.org/thinkinglabs/the-100percent-test-coverage-fallacy.svg?branch=master)](https://travis-ci.org/thinkinglabs/the-100percent-code-coverage-fallacy) [![Coverage Status](https://coveralls.io/repos/github/thinkinglabs/the-100-percent-code-coverage-fallacy/badge.svg?branch=master)](https://coveralls.io/github/thinkinglabs/the-100-percent-code-coverage-fallacy?branch=master)

The idea for this repository popped up when I heard the following story:

<blockquote class="twitter-tweet" data-lang="en"><p lang="en" dir="ltr">Team has a 30% code coverage. After running mutation tests, drops to 3% coverage.<br>When a metric becomes a target you fool it. Goodhart&#39;s Law</p>&mdash; Thierry de Pauw (@tdpauw) <a href="https://twitter.com/tdpauw/status/890112157450481664">July 26, 2017</a></blockquote>

Inside that organisation, having 30% code coverage was a big achievement, as most teams had no or very little code coverage. You can imagine the team was very proud. Until the day someone had the clever idea to run [mutation tests](https://en.wikipedia.org/wiki/Mutation_testing) against the code base. All of a sudden the code coverage dropped to 3%.

What happened ?
> I expect a high level of coverage. Sometimes managers require one. There's a subtle difference.
>
> &mdash; Brian Marick

The manager of the team defined code coverage as a KPI. So naturally the team did whatever was possible to improve the code coverage using low quality testing.
This is a perfect example of [Goodhart's Law](https://en.wikipedia.org/wiki/Goodhart%27s_law).

> Any observed statistical regularity will tend to collapse once pressure is placed upon it for control purposes.
>
> &mdash; Goodhart's Law

Or said differently: _Any metric looses it value whenever it becomes a target._

In the past I had numerous discussions with team members on what is an acceptable [code coverage](https://martinfowler.com/bliki/TestCoverage.html) and should we enforce this. I even once met somebody who expected 100% code coverage from his team. code coverage is a crappy metric. But it is a useful tool to find untested parts of your system. Good code coverage is when you are rarely scared of introducing a bug after a code change.

This repo show cases a system with 100% code coverage (as you can see from the coverage badge) using tests that say nothing useful. In fact it makes use of [Assertion Free Testing](https://martinfowler.com/bliki/AssertionFreeTesting.html).

The system is an implementation of the [FizzBuzz Kata](http://codingdojo.org/kata/FizzBuzz/). It was grown using TDD. Once fully implemented, I removed all assertions (see [FizzBuzzTest](./src/test/java/io/thinkinglabs/FizzBuzzTest.java)). The system has still 100% code coverage. But when running mutation tests none of the mutations gets killed, so resulting in 0% usefulness of the tests.

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
