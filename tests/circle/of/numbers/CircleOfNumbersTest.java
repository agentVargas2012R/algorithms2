package circle.of.numbers;

import org.junit.Assert;
import org.junit.Test;

public class CircleOfNumbersTest {

    private CircleOfNumbersContainer circleOfNumbersContainer = new CircleOfNumbersContainer();
    /**
     * Input:
     *  n:                  10
     *  firstNumber:        7
     *
     * Expected Output:     2
     */
    @Test
    public void test1() {
        int n = 10;
        int firstNumber = 7;
        int pass = 2;

        int result = circleOfNumbersContainer.circleOfNumbers(n, firstNumber);

        Assert.assertTrue(n + " and " + 7 + " should equal " + pass, (pass == result));
    }


    @Test
    public void test2() {
        int n = 10;
        int firstNumber = 2;
        int pass = 7;

        int result = circleOfNumbersContainer.circleOfNumbers(n, firstNumber);

        Assert.assertTrue(n + " and " + 7 + " should equal " + pass, (pass == result));
    }

    @Test
    public void test3() {
        int n = 4;
        int firstNumber = 1;
        int pass = 3;

        int result = circleOfNumbersContainer.circleOfNumbers(n, firstNumber);

        Assert.assertTrue(n + " and " + 7 + " should equal " + pass, (pass == result));
    }

    @Test
    public void test4() {
        int n = 6;
        int firstNumber = 3;
        int pass = 0;

        int result = circleOfNumbersContainer.circleOfNumbers(n, firstNumber);

        Assert.assertTrue(n + " and " + 7 + " should equal " + pass, (pass == result));
    }

    @Test
    public void test5() {
        int n = 12;
        int firstNumber = 10;
        int pass = 4;

        int result = circleOfNumbersContainer.circleOfNumbers(n, firstNumber);

        Assert.assertTrue(n + " and " + 7 + " should equal " + pass, (pass == result));
    }


    @Test
    public void test6() {
        int n = 18;
        int firstNumber = 5;
        int pass = 14;

        int result = circleOfNumbersContainer.circleOfNumbers(n, firstNumber);

        Assert.assertTrue(n + " and " + 7 + " should equal " + pass, (pass == result));
    }
}
