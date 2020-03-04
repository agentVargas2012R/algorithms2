package string.rearrange;

import org.junit.Assert;
import org.junit.Test;

public class StringRearrangeTest {

    private StringRearrangeContainer stringRearrangeContainer = new StringRearrangeContainer();

    /**
     * Input:
     *  inputArray:
     *   ["aba",
     *    "bbb",
     *    "bab"]
     *
     * Expected Output:
     *   false
     */
    @Test
    public void test1() {
        String[] inputArray = new String[3];
        inputArray[0] = "aba";
        inputArray[1] = "bbb";
        inputArray[2] = "bab";
        Boolean pass = false;
        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }

    /**
     * Input:
     *  inputArray:
     *   ["ab",
     *    "bb",
     *    "aa"]
     *
     * Expected Output:
     *  true
     */
    @Test
    public void test2() {
        String[] inputArray = new String[3];
        inputArray[0] = "ab";
        inputArray[1] = "bb";
        inputArray[2] = "aa";
        Boolean pass = true;
        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }

    @Test
    public void test3() {
        String[] inputArray = new String[2];
        inputArray[0] = "q";
        inputArray[1] = "q";
        Boolean pass = false;
        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }

    @Test
    public void test4() {
        String[] inputArray = new String[3];
        inputArray[0] = "zzzzab";
        inputArray[1] = "zzzzbb";
        inputArray[2] = "zzzzaa";
        Boolean pass = true;

        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }

    @Test
    public void test5() {
        String[] inputArray = new String[4];
        inputArray[0] = "ab";
        inputArray[1] = "ad";
        inputArray[2] = "ef";
        inputArray[3] = "eg";

        Boolean pass = false;
        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }

    @Test
    public void test6() {
        String[] inputArray = new String[6];
        inputArray[0] = "abc";
        inputArray[1] = "bef";
        inputArray[2] = "bcc";
        inputArray[3] = "bec";
        inputArray[4] = "bbc";
        inputArray[5] = "bdc";

        Boolean pass = true;
        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }

    @Test
    public void test7() {
        String[] inputArray = new String[4];
        inputArray[0] = "abc";
        inputArray[1] = "abx";
        inputArray[2] = "axx";
        inputArray[3] = "abc";

        Boolean pass = false;
        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }

    @Test
    public void test9() {
        String[] inputArray = new String[5];
        inputArray[0] = "abc";
        inputArray[1] = "abx";
        inputArray[2] = "axx";
        inputArray[3] = "abx";
        inputArray[4] = "abc";

        Boolean pass = true;
        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }

    @Test
    public void test10() {
        String[] inputArray = new String[5];
        inputArray[0] = "ff";
        inputArray[1] = "gf";
        inputArray[2] = "af";
        inputArray[3] = "ar";
        inputArray[4] = "hf";

        Boolean pass = true;
        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }

    @Test
    public void test11() {
        String[] inputArray = new String[3];
        inputArray[0] = "a";
        inputArray[1] = "b";
        inputArray[2] = "c";

        Boolean pass = true;
        Boolean result = stringRearrangeContainer.stringsRearrangement(inputArray);

        Assert.assertTrue(result == pass);
    }
}

