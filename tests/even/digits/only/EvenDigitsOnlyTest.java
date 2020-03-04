package even.digits.only;

import org.junit.Assert;
import org.junit.Test;

/**
 * Check if all digits of the given integer are even.
 */
public class EvenDigitsOnlyTest {

    EvenDigitsOnlyContainer evenDigitsOnlyContainer = new EvenDigitsOnlyContainer();
    /**
     * Input:
     *   n: 248622
     *
     * Expected Output:
     *   true
     */
    @Test
    public void test1() {
        int n = 248622;
        Boolean result = evenDigitsOnlyContainer.evenDigitsOnly(n);
        Boolean pass = true;
        if(result != pass){
            Assert.assertTrue(n + " should be " + pass, false);
        }
    }

    /**
     * Input:
     *  n: 642386
     *
     * Expected Output:
     *  false
     */
    @Test
    public void test2() {
        int n = 642386;
        Boolean result = evenDigitsOnlyContainer.evenDigitsOnly(n);
        Boolean pass = false;
        if(result != pass){
            Assert.assertTrue(n + " should be " + pass, false);
        }
    }

    /**
     * Input:
     *  n: 248842
     *
     * Expected Output:
     *  true
     */
    @Test
    public void test3() {
        int n = 248842;
        Boolean result = evenDigitsOnlyContainer.evenDigitsOnly(n);
        Boolean pass = true;
        if(result != pass){
            Assert.assertTrue(n + " should be " + pass, pass);
        }
    }

    /**
     * Input:
     *  n: 1
     *
     * Expected Output:
     *   false
     */
    @Test
    public void test4() {
        int n = 1;
        Boolean result = evenDigitsOnlyContainer.evenDigitsOnly(n);
        Boolean pass = false;
        if(result != pass){
            Assert.assertTrue(n + " should be " + pass, pass);
        }
    }

    /**
     * Input:
     *  n: 468402800
     *
     * Expected Output:
     *  true
     */
    @Test
    public void test5() {
        int n = 468402800;
        Boolean result = evenDigitsOnlyContainer.evenDigitsOnly(n);
        Boolean pass = true;
        if(result != pass){
            Assert.assertTrue(n + " should be " + pass, pass);
        }
    }
}
