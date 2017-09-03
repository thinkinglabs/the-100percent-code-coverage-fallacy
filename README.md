# The Fallacy of the 100% test coverage [![Build Status](https://travis-ci.org/thinkinglabs/the-100-percent-code-coverage-fallacy.svg?branch=master)](https://travis-ci.org/thinkinglabs/the-100-percent-code-coverage-fallacy) [![Coverage Status](https://coveralls.io/repos/github/thinkinglabs/the-100-percent-code-coverage-fallacy/badge.svg?branch=master)](https://coveralls.io/github/thinkinglabs/the-100-percent-code-coverage-fallacy?branch=master)

The idea for this repository popped up when I heard the following story:

<blockquote class="twitter-tweet" data-lang="en"><p lang="en" dir="ltr">Team has a 30% code coverage. After running mutation tests, drops to 3% coverage.<br>When a metric becomes a target you fool it. Goodhart&#39;s Law</p>&mdash; Thierry de Pauw (@tdpauw) <a href="https://twitter.com/tdpauw/status/890112157450481664">July 26, 2017</a></blockquote>

Inside that organisation, having 30% test coverage was a big achievement, as most teams had no or very little test coverage. You can imagine the team was very proud. Until the day someone had the clever idea to run [mutation tests](https://en.wikipedia.org/wiki/Mutation_testing) against the code base. All of a sudden the test coverage dropped to 3%.

What happened ? The team got test coverage defined by their manager as KPI. So naturally the team did whatever was possible to improve the test coverage using low quality testing.

> I expect a high level of coverage. Sometimes managers require one. There's a subtle difference.
>
> &mdash; Brian Marick

This is a perfect example of [Goodhart's Law](https://en.wikipedia.org/wiki/Goodhart%27s_law).

> Any observed statistical regularity will tend to collapse once pressure is placed upon it for control purposes.
>
> &mdash; Goodhart's Law

Or said differently: _Any metric looses it value whenever it becomes a target._

In the past I had numerous discussions with team members on what is an acceptable [test coverage](https://martinfowler.com/bliki/TestCoverage.html) value and should we enforce this. I once encountered somebody who expected 100% test coverage from his team.
The system was grown using TDD. After which I removed all assertions from the test class but leaving all existing test cases in place. This results in 100% code coverage. But if you run the mutation tests all mutations all mutants survive and code coverage drops to 0%.

At this stage, it is now possible to change the implementation without having any failing tests.

## Test Coverage report
The test coverage is measured using [JaCoCo](http://www.eclemma.org/jacoco/).

To obtain a test coverage report:
```
$ ./gradlew test jacocoTestReport
```

The coverage report can be found at `build/reports/jacoco/test/html/index.html`

## Mutation Testing report
The mutation testing is done using [PIT](http://pitest.org/).

To obtain a mutation testing report:
```
$ ./gradlew pitest
```

The build will fail because not 100% of the mutations were killed. In the report you will see that the test coverage dropped to 0%.

The mutation testing report can be found at `build/reports/pitest/YYYYMMddhhmm/index.html`
