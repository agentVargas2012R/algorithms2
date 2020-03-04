package absolute.values.sum.minimization;

import absolute.value.sum.minimization.AbsoluteValuesSumMinimizationContainer;
import org.junit.Assert;
import org.junit.Test;

public class AbsoluteValuesSumMinimizationTest {

    private AbsoluteValuesSumMinimizationContainer absoluteValuesSumMinimizationContainer = new AbsoluteValuesSumMinimizationContainer();
    /**
     * Input:
     *  a: [2, 4, 7]
     *
     * Expected Output:
     *  4
     */
    @Test
    public void test1(){
        int[] a  = new int[3];
        a[0] = 2;
        a[1] = 4;
        a[2] = 7;
        int pass = 4;

        int result = absoluteValuesSumMinimizationContainer.absoluteValuesSumMinimization(a);

        Assert.assertTrue("The answer should be " + pass + " instead of " + result, pass == result);
    }

    @Test
    public void test2(){
        int[] a  = new int[2];
        a[0] = 2;
        a[1] = 3;

        int pass = 2;

        int result = absoluteValuesSumMinimizationContainer.absoluteValuesSumMinimization(a);

        Assert.assertTrue("The answer should be " + pass + " instead of " + result, pass == result);
    }

    @Test
    public void test3() {
        int[] a  = new int[4];
        a[0] = 1;
        a[1] = 1;
        a[2] = 3;
        a[3] = 4;

        int pass = 1;

        int result = absoluteValuesSumMinimizationContainer.absoluteValuesSumMinimization(a);

        Assert.assertTrue("The answer should be " + pass + " instead of " + result, pass == result);

    }

    @Test
    public void test4() {
        int[] a  = new int[1];
        a[0] = 23;

        int pass = 23;

        int result = absoluteValuesSumMinimizationContainer.absoluteValuesSumMinimization(a);

        Assert.assertTrue("The answer should be " + pass + " instead of " + result, pass == result);

    }

    /**
     * [-10, -10, -10, -10, -10, -9, -9, -9, -8, -8,
     * -7, -6, -5, -4, -3, -2, -1, 0, 0, 0,
     * 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
     * 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
     * 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
     * 30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
     * 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
     * 50]
     */
    @Test
    public void test5() {
        int[] a  = new int[71];

        a[0] = -10; a[1] = -10; a[2] = -10; a[3] = -10; a[4] = -10; a[5] = -9; a[6] = -9; a[7] = -9; a[8] = -8; a[9] = -8;
        //-7, -6, -5, -4, -3, -2, -1, 0, 0, 0,
        a[10] = -7; a[11] = -6; a[12] = -5; a[13] = -4; a[14] = -3; a[15] = -2; a[16] = -1; a[17] = 0; a[18] = 0; a[19] = 0;
        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
        a[20] = 0; a[21] = 1; a[22] = 2; a[23] = 3; a[24] = 4; a[25] = 5; a[26] = 6; a[27] = 7; a[28] = 8; a[29] = 9;
        //10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
        a[30] = 10; a[31] = 11; a[32] = 12; a[33] = 13; a[34] = 14; a[35] = 15; a[36] = 16; a[37] = 17; a[38] = 18; a[39] = 19;
        //* 20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
        a[40] = 20; a[41] = 21; a[42] = 22; a[43] = 23; a[44] = 24; a[45] = 25; a[46] = 26; a[47] = 27; a[48] = 28; a[49] = 29;
        //30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
        a[50] = 30; a[51] = 31; a[52] = 32; a[53] = 33; a[54] = 34; a[55] = 35; a[56] = 36; a[57] = 37; a[58] = 38; a[59] = 39;
        //40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
        a[60] = 40; a[61] = 41; a[62] = 42; a[63] = 43; a[64] = 44; a[65] = 45; a[66] = 46; a[67] = 47; a[68] = 48; a[69] = 49;
        //* 50]
        a[70] = 50;

        int pass = 15;

        int result = absoluteValuesSumMinimizationContainer.absoluteValuesSumMinimization(a);

        Assert.assertTrue("The answer should be " + pass + " instead of " + result, pass == result);

    }

    @Test
    public void test6() {
        int[] a  = new int[2];
        a[0] = -4;
        a[1] = -1;

        int pass = -4;

        int result = absoluteValuesSumMinimizationContainer.absoluteValuesSumMinimization(a);

        Assert.assertTrue("The answer should be " + pass + " instead of " + result, pass == result);
    }


    @Test
    public void test7() {
        //[-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000]

        int[] a  = new int[15];
        a[0] = -1000000;
        a[1] = -10000;
        a[2] = -10000;
        a[3] = -1000;
        a[4] = -100;
        a[5] = -10;
        a[6] = -1;
        a[7] = 0;
        a[8] = 1;
        a[9] = 10;
        a[10] = 100;
        a[11] = 1000;
        a[12] = 10000;
        a[13] = 100000;
        a[14] = 1000000;


        int pass = 0;

        int result = absoluteValuesSumMinimizationContainer.absoluteValuesSumMinimization(a);

        Assert.assertTrue("The answer should be " + pass + " instead of " + result, pass == result);

    }
}

