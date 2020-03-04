package alphabetic.shift;

import org.junit.Assert;
import org.junit.Test;

public class AlphabeticShiftTest {

    private AlphabeticShiftContainer alphabeticShiftContainer = new AlphabeticShiftContainer();

    /**
     * Input:
     *  inputString: "crazy"
     *
     * Expected Output:
     *  "dsbaz"
     */
    @Test
    public void test1() {
        String inputString = "crazy";
        String result = alphabeticShiftContainer.alphabeticShift(inputString);
        String pass = "dsbaz";
        if(!(pass.equals(result))) {
            Assert.assertTrue(inputString + " should be transformed to " + pass, false);
        }
    }

    /**
     * Input:
     *  inputString: "z"
     *
     * Expected Output:\
     *  "a"
     */
    @Test
    public void test2() {
        String inputString = "z";
        String result = alphabeticShiftContainer.alphabeticShift(inputString);
        String pass = "a";
        if(!(pass.equals(result))) {
            Assert.assertTrue(inputString + " should be transformed to " + pass, false);
        }
    }

    /**
     * Input:
     *  inputString: "aaaabbbccd"
     *
     * Expected Output:
     *  "bbbbcccdde"
     */
    @Test
    public void test3() {
        String inputString = "aaaabbbccd";
        String result = alphabeticShiftContainer.alphabeticShift(inputString);
        String pass = "bbbbcccdde";
        if(!(pass.equals(result))) {
            Assert.assertTrue(inputString + " should be transformed to " + pass, false);
        }
    }
}
