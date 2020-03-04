package palindrome.rearrange;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PalindromeRearrangingTest {

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    /**
     * Input: inputString: "aabb"
     *
     * Expected Output:true
     */
    @Test
    public void test1(){
        String testData = "aabb";
        boolean pass = true;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     * input: "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"
     *
     * output: true
     */
     @Test
    public void test2() {
         String testData = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
         boolean pass = false;

         Palindrome palindrome = new Palindrome();
         boolean result = palindrome.palindromeRearranging(testData);

         System.out.println("Pass: " + pass + " RESULT: " + result);
         assert(pass == result);
     }

    /**
     * input: "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"
     *
     * output: true
     */
    @Test
    public void test3() {
        String testData = "abbcabb";
        boolean pass = true;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     * input: "zyyzzzzz"
     *
     * output: true
     */
    @Test
    public void test4() {
        String testData = "zyyzzzzz";
        boolean pass = true;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     * input: "zyyzzzzz"
     *
     * output: true
     */
    @Test
    public void test5() {
        String testData = "z";
        boolean pass = true;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }


    /**
     * input: "zaa"
     *
     * output: true
     */
    @Test
    public void test6() {
        String testData = "zaa";
        boolean pass = true;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     * input: "zaa"
     *
     * output: true
     */
    @Test
    public void test7() {
        String testData = "abca";
        boolean pass = false;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     * input: "zaa"
     *
     * output: true
     */
    @Test
    public void test8() {
        String testData = "abcad";
        boolean pass = false;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     * input: "zaa"
     *
     * output: true
     */
    @Test
    public void test9() {
        String testData = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
        boolean pass = false;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     * input: "zaa"
     *
     * output: true
     */
    @Test
    public void test10() {
        String testData = "abdhuierf";
        boolean pass = false;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     * Test 19 = "acbbbca"
     *
     * if you iterate over the string with for c in inputString
     * you will encounter b 3 times if you use c % 2 == 0 you will increase it 3 times -> fail
     * You have to use set(inputString) so you have a set of each character only once
     * and do not iterate over the same letter twice
     */
    @Test
    public void test19(){
        String testData = "acbbbca";
        boolean pass = false;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     *  Test 20 = "a"
     */
    @Test
    public void test20(){
        String testData = "a";
        boolean pass = true;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    /**
     * "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa"
     */
    @Test
    public void test21(){
        String testData = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
        boolean pass = false;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }

    @Test
    public void test22(){
        String testData = "...";
        boolean pass = true;

        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.palindromeRearranging(testData);

        System.out.println("Pass: " + pass + " RESULT: " + result);
        assert(pass == result);
    }
}

