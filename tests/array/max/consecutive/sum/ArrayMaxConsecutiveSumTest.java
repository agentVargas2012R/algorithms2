package array.max.consecutive.sum;

import org.junit.Assert;
import org.junit.Test;

public class ArrayMaxConsecutiveSumTest {

    private ArrayMaxConsecutiveSumContainer arrayMaxConsecutiveSumContainer = new ArrayMaxConsecutiveSumContainer();
    /**
     * Input:
     *  inputArray: [2, 3, 5, 1, 6]
     *  k: 2
     *
     * Expected Output:
     *  8
     */
    @Test
    public void test1() {
        int k = 2;
        int[] inputArray = new int[5];
        inputArray[0] = 2;
        inputArray[1] = 3;
        inputArray[2] = 5;
        inputArray[3] = 1;
        inputArray[4] = 6;

        int result = arrayMaxConsecutiveSumContainer.arrayMaxConsecutiveSum(inputArray, 2);
        int pass = 8;

        Assert.assertTrue("the cnsecutive array max should be " +
                        pass + " and instead was " + result, result == pass);
    }

    @Test
    public void test2() {
        int k = 2;
        int[] inputArray = new int[4];
        inputArray[0] = 2;
        inputArray[1] = 4;
        inputArray[2] = 10;
        inputArray[3] = 1;

        int result = arrayMaxConsecutiveSumContainer.arrayMaxConsecutiveSum(inputArray, k);
        int pass = 14;

        Assert.assertTrue("the cnsecutive array max should be " +
                pass + " and instead was " + result, result == pass);
    }

    /**
     * Input:
     *  inputArray: [1, 3, 2, 4]
     *  k: 3
     *
     * Expected Output:
     *  9
     */
    @Test
    public void test3() {
        int k = 3;
        int[] inputArray = new int[4];
        inputArray[0] = 1;
        inputArray[1] = 3;
        inputArray[2] = 2;
        inputArray[3] = 4;

        int result = arrayMaxConsecutiveSumContainer.arrayMaxConsecutiveSum(inputArray, k);
        int pass = 9;

        Assert.assertTrue("the cnsecutive array max should be " +
                pass + " and instead was " + result, result == pass);

    }

}
