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
        assertThat(fizzBuzz()).isEqualTo(1);
    }

    private int fizzBuzz()
    {
        return 1;
    }
}
