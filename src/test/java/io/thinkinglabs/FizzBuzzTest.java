package io.thinkinglabs;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author @tdpauw
 */
public class FizzBuzzTest
{
    @Test
    public void shouldReturn1WhenInputIs1() {
        assertThat(fizzBuzz(1)).isEqualTo(1);
    }

    @Test
    public void shouldReturn2WhenInputIs2() {
        assertThat(fizzBuzz(2)).isEqualTo(2);
    }

    private int fizzBuzz(int value)
    {
        return value;
    }
}
