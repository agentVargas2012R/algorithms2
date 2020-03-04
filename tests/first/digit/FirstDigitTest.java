package first.digit;

import org.junit.Assert;
import org.junit.Test;

public class FirstDigitTest {

    private FirstDigitContainer firstDigitContainer = new FirstDigitContainer();
    /**
     * Input:
     *  inputString: "var_1__Int"
     *
     * Expected Output:
     *  "1"
     */
    @Test
    public void test1() {
        String inputString = "var_1_Int";
        char output = firstDigitContainer.firstDigit(inputString);
        char pass = '1';

        Assert.assertTrue("Output is " + output + " and should be " + pass,pass == output);
    }

    /**
     * Input:
     *  inputString: "q2q-q"
     *
     * Expected Output:
     *  "2"
     */
    @Test
    public void test2() {
        String inputString = "q2q-q";
        char output = firstDigitContainer.firstDigit(inputString);
        char pass = '2';

        Assert.assertTrue("Output is " + output + " and should be " + pass,pass == output);
    }

    /**
     * Input:
     *  inputString: "0ss"
     *
     * Expected Output:
     *  "0"
     */
    @Test
    public void test3() {
        String inputString = "0ss";
        char output = firstDigitContainer.firstDigit(inputString);
        char pass = '0';

        Assert.assertTrue("Output is " + output + " and should be " + pass,pass == output);
    }

    @Test
    public void test4() {
        String inputString = "_Aas_23";
        char output = firstDigitContainer.firstDigit(inputString);
        char pass = '2';

        Assert.assertTrue("Output is " + output + " and should be " + pass,pass == output);
    }

    @Test
    public void test5() {
        String inputString = "a a_933";
        char output = firstDigitContainer.firstDigit(inputString);
        char pass = '9';

        Assert.assertTrue("Output is " + output + " and should be " + pass,pass == output);
    }
}
