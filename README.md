# The Fallacy of the 100% code coverage [![Build Status](https://travis-ci.org/thinkinglabs/the-100-percent-code-coverage-fallacy.svg?branch=master)](https://travis-ci.org/thinkinglabs/the-100-percent-code-coverage-fallacy) [![Coverage Status](https://coveralls.io/repos/github/thinkinglabs/the-100-percent-code-coverage-fallacy/badge.svg?branch=master)](https://coveralls.io/github/thinkinglabs/the-100-percent-code-coverage-fallacy?branch=master)

What is good code coverage ... Is it 50%, 80%, 100% ? Well in fact it doesn't matter. Code coverage alone doesn't say anything useful about how well the system is tested.

This is the point I wanted to make with this repo. Create an example of a system having 100% code coverage with 0 valuable tests. When you have a look at [FizzBuzzTest](./src/test/java/io/thinkinglabs/FizzBuzzTest.java), you'll see there are absolutely no assertions. So all lines are covered but nothing useful is said in the assertions.

Recently I heard the following story:
<blockquote class="twitter-tweet" data-lang="en"><p lang="en" dir="ltr">Team has a 30% code coverage. After running mutation tests, drops to 3% coverage.<br>When a metric becomes a target you fool it. Goodhart&#39;s Law</p>&mdash; Thierry de Pauw (@tdpauw) <a href="https://twitter.com/tdpauw/status/890112157450481664">July 26, 2017</a></blockquote>

I recently got confirmation about this when I heard the story of a team being so proud they had 30% code coverage. Inside that organisation this was a real achievement as most teams had no or very little code coverage. One day someone ran [mutation tests](https://en.wikipedia.org/wiki/Mutation_testing) against their code base. And all of a sudden the code coverage dropped to 3%.

What happened ? Code coverage was a KPI for that team. So naturally the team did whatever was possible to improve the code coverage.
Which is a perfect example of [Goodhart's Law](https://en.wikipedia.org/wiki/Goodhart%27s_law).

> Any observed statistical regularity will tend to collapse once pressure is placed upon it for control purposes.
>
> &mdash; Goodhart's Law

_Any metric looses it value whenever it becomes a target._

## Test Coverage
The test coverage is measured using [JaCoCo](http://www.eclemma.org/jacoco/).

To obtain a test coverage report:
```
$ ./gradlew test jacocoTestReport
```

The coverage report can be found at `build/reports/jacoco/test/html/index.html`

## Mutation Testing
The mutation testing is done using [PIT](http://pitest.org/).

To obtain a mutation testing report:
```
$ ./gradlew pitest
```

The build will fail because not 100% of the mutations were killed. In the report you will see that the test coverage dropped to 0%.

The mutation testing report can be found at `build/reports/pitest/YYYYMMddhhmm/index.html`
