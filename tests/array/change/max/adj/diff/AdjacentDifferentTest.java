package array.change.max.adj.diff;

import array.max.adj.diff.AdjacentDifference;
import org.junit.Assert;
import org.junit.Test;

public class AdjacentDifferentTest {


    /**
     * For inputArray = [2, 4, 1, 0],
     *
     * the output should be arrayMaximalAdjacentDifference(inputArray) = 3.
     */
    @Test
    public void test1(){
       int pass = 3;

       int[] inputArray = new int[4];

       inputArray[0] = 2;
       inputArray[1] = 4;
       inputArray[2] = 1;
       inputArray[3] = 0;

        AdjacentDifference adjDifference = new AdjacentDifference();
        int result = adjDifference.arrayMaximalAdjacentDifference(inputArray);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(result == pass);
    }

    /**
     * For inputArray: [1, 1, 1, 1]
     *
     * the output should be arrayMaximalAdjacentDifference(inputArray) = 3.
     */
    @Test
    public void test2(){
        int pass = 0;

        int[] inputArray = new int[4];

        inputArray[0] = 1;
        inputArray[1] = 1;
        inputArray[2] = 1;
        inputArray[3] = 1;

        AdjacentDifference adjDifference = new AdjacentDifference();
        int result = adjDifference.arrayMaximalAdjacentDifference(inputArray);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(result == pass);
    }

    /**
     * For inputArray: [-1, 4, 10, 3, -2]
     *
     * the output should be arrayMaximalAdjacentDifference(inputArray) = 3.
     */
    @Test
    public void test3(){
        int pass = 7;

        int[] inputArray = new int[5];

        inputArray[0] = -1;
        inputArray[1] = 4;
        inputArray[2] = 10;
        inputArray[3] = 3;
        inputArray[4] = -2;

        AdjacentDifference adjDifference = new AdjacentDifference();
        int result = adjDifference.arrayMaximalAdjacentDifference(inputArray);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(result == pass);
    }

    /**
     * For inputArray: [-2, -2, -2, -2, -2]
     *
     * the output should be arrayMaximalAdjacentDifference(inputArray) = 0.
     */
    @Test
    public void test4(){
        int pass = 0;

        int[] inputArray = new int[5];

        inputArray[0] = -2;
        inputArray[1] = -2;
        inputArray[2] = -2;
        inputArray[3] = -2;
        inputArray[4] = -2;

        AdjacentDifference adjDifference = new AdjacentDifference();
        int result = adjDifference.arrayMaximalAdjacentDifference(inputArray);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(result == pass);
    }

    /**
     * For inputArray: [-1, 1, -3, -4]
     *
     * the output should be arrayMaximalAdjacentDifference(inputArray) = 4.
     */
    @Test
    public void test5(){
        int pass = 4;

        int[] inputArray = new int[4];

        inputArray[0] = -1;
        inputArray[1] = 1;
        inputArray[2] = -3;
        inputArray[3] = -4;

        AdjacentDifference adjDifference = new AdjacentDifference();
        int result = adjDifference.arrayMaximalAdjacentDifference(inputArray);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(result == pass);
    }
}
