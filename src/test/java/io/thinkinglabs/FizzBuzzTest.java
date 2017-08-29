package io.thinkinglabs;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author @tdpauw
 */
public class FizzBuzzTest
{
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturn1WhenInputIs1() {
        assertThat(fizzBuzz.print(1)).isEqualTo("1");
    }

    @Test
    public void shouldReturn2WhenInputIs2() {
        assertThat(fizzBuzz.print(2)).isEqualTo("2");
    }

    @Test
    public void shouldReturnFizzWhenInputIs3() {
        assertThat(fizzBuzz.print(3)).isEqualTo("Fizz");
    }

    @Test
    public void shouldReturn4WhenInputIs4() {
        assertThat(fizzBuzz.print(4)).isEqualTo("4");
    }

    @Test
    public void shouldReturnBuzzWhenInputIs5() {
        assertThat(fizzBuzz.print(5)).isEqualTo("Buzz");
    }

    @Test
    public void shouldReturnFizzWhenInputIs6() {
        assertThat(fizzBuzz.print(6)).isEqualTo("Fizz");
    }

    @Test
    public void shouldReturn7WhenInputIs7() {
        assertThat(fizzBuzz.print(7)).isEqualTo("7");
    }

    @Test
    public void shouldReturnFizzWhenDivisibleBy3() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(fizzBuzz.print(9)).isEqualTo("Fizz");
        softly.assertThat(fizzBuzz.print(12)).isEqualTo("Fizz");
        softly.assertThat(fizzBuzz.print(18)).isEqualTo("Fizz");
        softly.assertThat(fizzBuzz.print(21)).isEqualTo("Fizz");
        softly.assertAll();
    }

    @Test
    public void shouldReturnBuzzWhenInputIs10() {
        assertThat(fizzBuzz.print(10)).isEqualTo("Buzz");
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleBy5() {
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(fizzBuzz.print(20)).isEqualTo("Buzz");
        softly.assertThat(fizzBuzz.print(25)).isEqualTo("Buzz");
        softly.assertThat(fizzBuzz.print(35)).isEqualTo("Buzz");
        softly.assertThat(fizzBuzz.print(40)).isEqualTo("Buzz");
        softly.assertAll();
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIs15() {
        assertThat(fizzBuzz.print(15)).isEqualTo("FizzBuzz");
    }
}
