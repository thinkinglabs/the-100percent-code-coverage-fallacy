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
        fizzBuzz.print(1);
    }

    @Test
    public void shouldReturn2WhenInputIs2() {
        fizzBuzz.print(2);
    }

    @Test
    public void shouldReturnFizzWhenInputIs3() {
        fizzBuzz.print(3);
    }

    @Test
    public void shouldReturn4WhenInputIs4() {
        fizzBuzz.print(4);
    }

    @Test
    public void shouldReturnBuzzWhenInputIs5() {
        fizzBuzz.print(5);
    }

    @Test
    public void shouldReturnFizzWhenInputIs6() {
        fizzBuzz.print(6);
    }

    @Test
    public void shouldReturn7WhenInputIs7() {
        fizzBuzz.print(7);
    }

    @Test
    public void shouldReturnFizzWhenDivisibleBy3() {
        fizzBuzz.print(9);
        fizzBuzz.print(12);
        fizzBuzz.print(18);
        fizzBuzz.print(21);
    }

    @Test
    public void shouldReturnBuzzWhenInputIs10() {
        fizzBuzz.print(10);
    }

    @Test
    public void shouldReturnBuzzWhenDivisibleBy5() {
        fizzBuzz.print(20);
        fizzBuzz.print(25);
        fizzBuzz.print(35);
        fizzBuzz.print(40);
    }

    @Test
    public void shouldReturnFizzBuzzWhenInputIs15() {
        fizzBuzz.print(15);
    }

    @Test
    public void shouldReturnFizzBuzzWhenDivisibleBy3And5() {
        fizzBuzz.print(30);
        fizzBuzz.print(45);
        fizzBuzz.print(60);
    }
}
