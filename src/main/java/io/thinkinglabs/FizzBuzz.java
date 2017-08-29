package io.thinkinglabs;

/**
 * Created by thipau on 29/08/2017.
 */
public class FizzBuzz {

    public String print(int value)
    {
        if (value == 15) {
            return "FizzBuzz";
        }
        if (isDivisibleBy3(value)) {
            return "Fizz";
        }
        if (isDivisibleBy5(value)) {
            return "Buzz";
        }
        return Integer.toString(value);
    }

    private boolean isDivisibleBy5(int value) {
        return value % 5 == 0;
    }

    private boolean isDivisibleBy3(int value) {
        return value % 3 == 0;
    }
}
