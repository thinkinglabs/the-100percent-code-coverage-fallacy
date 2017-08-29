package io.thinkinglabs;

import org.assertj.core.api.IntegerAssert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author @tdpauw
 */
public class FizzBuzzTest
{
    @Test
    public void shouldReturn1WhenInputIs1() {
        assertThat(fizzBuzz(1)).isEqualTo("1");
    }

    @Test
    public void shouldReturn2WhenInputIs2() {
        assertThat(fizzBuzz(2)).isEqualTo("2");
    }

    @Test
    public void shouldReturnFizzWhenInputIs3() {
        assertThat(fizzBuzz(3)).isEqualTo("Fizz");
    }

    @Test
    public void shouldReturn4WhenInputIs4() {
        assertThat(fizzBuzz(4)).isEqualTo("4");
    }

    @Test
    public void shouldReturnBuzzWhenInputIs5() {
        assertThat(fizzBuzz(5)).isEqualTo("Buzz");
    }

    @Test
    public void shouldReturnFizzWhenInputIs6() {
        assertThat(fizzBuzz(6)).isEqualTo("Fizz");
    }

    private String fizzBuzz(int value)
    {
        if (value == 3 || value == 6) {
            return "Fizz";
        }
        if (value == 5) {
            return "Buzz";
        }
        return Integer.toString(value);
    }
}
