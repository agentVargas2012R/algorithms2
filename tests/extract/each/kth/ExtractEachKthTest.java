package extract.each.kth;

import org.junit.Assert;
import org.junit.Test;

public class ExtractEachKthTest {

    private ExtractEachKthContainer extractEachKthContainer = new ExtractEachKthContainer();

    /**
     * Input:
     *  inputArray: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
     *  k: 3
     *
     * Expected Output:
     *  [1, 2, 4, 5, 7, 8, 10]
     */
    @Test
    public void test1() {
        int k = 3;
        int[] inputArray = new int[10];


        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 3;
        inputArray[3] = 4;
        inputArray[4] = 5;
        inputArray[5] = 6;
        inputArray[6] = 7;
        inputArray[7] = 8;
        inputArray[8] = 9;
        inputArray[9] = 10;

        //[1, 2, 4, 5, 7, 8, 10]
        int[] pass = new int[7];
        pass[0] = 1;
        pass[1] = 2;
        pass[2] = 4;
        pass[3] = 5;
        pass[4] = 7;
        pass[5] = 8;
        pass[6] = 10;

        int[] result = extractEachKthContainer.extractEachKth(inputArray, k);
        for(int i = 0; i < pass.length; i++){
            if(pass[i] != result[i]){
                Assert.assertTrue("result["+i+"] should be " + pass[i] + " instead of " + result[i], false);
            }
        }
    }

    /**
     * Input:
     *  inputArray: [1, 1, 1, 1, 1]
     *   k: 1
     *
     * Output:
     *  [0, 0, 0, 0]
     *
     * Expected Output: []
     */
    @Test
    public void test2() {
        int k = 1;
        int[] inputArray = new int[5];

        inputArray[0] = 1;
        inputArray[1] = 1;
        inputArray[2] = 1;
        inputArray[3] = 1;
        inputArray[4] = 1;

        int[] result = extractEachKthContainer.extractEachKth(inputArray, k);
        int[] pass = new int[0];

        Assert.assertTrue(result.length == pass.length);
    }

    /**
     *Input:
     *  inputArray: [1, 2, 1, 2, 1, 2, 1, 2]
     *  k: 2
     *
     *Expected Output:
     *  [1, 1, 1, 1]
     */
    @Test
    public void test3() {
        int k = 2;
        int[] inputArray = new int[8];

        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 1;
        inputArray[3] = 2;
        inputArray[4] = 1;
        inputArray[5] = 2;
        inputArray[6] = 1;
        inputArray[7] = 2;

        int[] result = extractEachKthContainer.extractEachKth(inputArray, k);

        int[] pass = new int[4];
        pass[0] = 1;
        pass[1] = 1;
        pass[2] = 1;
        pass[3] = 1;

        for(int i = 0; i < pass.length; i++){
            if(pass[i] != result[i]){
                Assert.assertTrue("result["+i+"] should be " + pass[i] + " instead of " + result[i], false);
            }
        }
    }

    @Test
    public void test4() {
        int k = 10;
        //1, 2, 1, 2, 1, 2, 1, 2
        int[] inputArray = new int[8];

        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 1;
        inputArray[3] = 2;
        inputArray[4] = 1;
        inputArray[5] = 2;
        inputArray[6] = 1;
        inputArray[7] = 2;

        int[] result = extractEachKthContainer.extractEachKth(inputArray, k);

        //1, 2, 1, 2, 1, 2, 1, 2
        int[] pass = new int[8];
        pass[0] = 1;
        pass[1] = 2;
        pass[2] = 1;
        pass[3] = 2;
        pass[4] = 1;
        pass[5] = 2;
        pass[6] = 1;
        pass[7] = 2;

        for(int i = 0; i < pass.length; i++){
            if(pass[i] != result[i]){
                Assert.assertTrue("result["+i+"] should be " + pass[i] + " instead of " + result[i], false);
            }
        }
    }
}
