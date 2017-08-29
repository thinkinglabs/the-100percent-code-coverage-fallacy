package io.thinkinglabs;

/**
 * Created by thipau on 29/08/2017.
 */
public class FizzBuzz {

    public String print(int value)
    {
        if (isDivisibleBy3(value)) {
            return "Fizz";
        }
        if (value == 5 || value == 10) {
            return "Buzz";
        }
        return Integer.toString(value);
    }

    private boolean isDivisibleBy3(int value) {
        return value % 3 == 0;
    }
}
