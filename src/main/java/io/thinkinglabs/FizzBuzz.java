package io.thinkinglabs;

/**
 * @author @tdpauw
 */
public class FizzBuzz {

    public String print(int value)
    {
        if (isDivisibleBy3(value) || isDivisibleBy5(value)) {
            StringBuilder result = new StringBuilder();
            if (isDivisibleBy3(value)) {
                result.append("Fizz");
            }
            if (isDivisibleBy5(value)) {
                result.append("Buzz");
            }
            return result.toString();
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
