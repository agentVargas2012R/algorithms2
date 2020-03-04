package longest.digits.prefix;

import org.junit.Assert;
import org.junit.Test;

public class LongestDigitsPrefixTests {

    private LongestDigitsPrefixContainer longestDigitsPrefixContainer = new LongestDigitsPrefixContainer();

    @Test
    public void test1() {
        String input = "123aa1";
        String pass = "123";

        String result = longestDigitsPrefixContainer.longestDigitsPrefix(input);
        Assert.assertTrue(result + " should equal " + pass, pass.equals(result));
    }


    /**
     * Input:
     * inputString: "0123456789"
     *
     * Expected Output: "0123456789"
     */
    @Test
    public void test2() {
        String input = "0123456789";
        String pass = "0123456789";

        String result = longestDigitsPrefixContainer.longestDigitsPrefix(input);
        Assert.assertTrue(result + " should equal " + pass, pass.equals(result));
    }

    @Test
    public void test3() {
        String input = "abcdefg";
        String pass = "";

        String result = longestDigitsPrefixContainer.longestDigitsPrefix(input);
        Assert.assertTrue(result + " should equal " + pass, pass.equals(result));
    }

    @Test
    public void test4() {
        String input = "  3) always check for whitespaces";
        String pass = "";

        String result = longestDigitsPrefixContainer.longestDigitsPrefix(input);
        Assert.assertTrue(result + " should equal " + pass, pass.equals(result));
    }
}
