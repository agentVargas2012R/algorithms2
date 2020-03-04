package are.similar;

import org.junit.Assert;
import org.junit.Test;

public class AreSimilarTest {

    @Test
    public void test1(){
        int[] testData1 = new int[3];
        testData1[0] =  1;
        testData1[1] = 2;
        testData1[2] = 3;


        int[] testData2 = new int[3];
        testData2[0] =  1;
        testData2[1] = 2;
        testData2[2] = 3;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertTrue(areSimilar.areSimilar2(testData1, testData2));
    }

    @Test
    public void test2(){
        int[] testData1 = new int[3];
        testData1[0] =  1;
        testData1[1] = 2;
        testData1[2] = 3;


        int[] testData2 = new int[3];
        testData2[0] =  2;
        testData2[1] = 1;
        testData2[2] = 3;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertTrue(areSimilar.areSimilar2(testData1, testData2));
    }

    @Test
    public void test3(){
        int[] testData1 = new int[3];
        testData1[0] =  1;
        testData1[1] = 2;
        testData1[2] = 2;


        int[] testData2 = new int[3];
        testData2[0] =  2;
        testData2[1] = 1;
        testData2[2] = 1;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertFalse(areSimilar.areSimilar2(testData1, testData2));
    }

    @Test
    public void test4(){
        int[] testData1 = new int[3];
        testData1[0] =  1;
        testData1[1] = 1;
        testData1[2] = 4;


        int[] testData2 = new int[3];
        testData2[0] =  1;
        testData2[1] = 2;
        testData2[2] = 3;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertFalse(areSimilar.areSimilar2(testData1, testData2));
    }

    @Test
    public void test5(){
        int[] testData1 = new int[3];
        testData1[0] =  1;
        testData1[1] = 2;
        testData1[2] = 3;


        int[] testData2 = new int[3];
        testData2[0] =  1;
        testData2[1] = 10;
        testData2[2] = 2;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertFalse(areSimilar.areSimilar2(testData1, testData2));
    }

    @Test
    public void test6(){
        int[] testData1 = new int[3];
        testData1[0] =  2;
        testData1[1] = 3;
        testData1[2] = 1;


        int[] testData2 = new int[3];
        testData2[0] =  1;
        testData2[1] = 3;
        testData2[2] = 2;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertTrue(areSimilar.areSimilar2(testData1, testData2));
    }

    @Test
    public void test7(){
        int[] testData1 = new int[3];
        testData1[0] =  2;
        testData1[1] = 3;
        testData1[2] = 9;


        int[] testData2 = new int[3];
        testData2[0] =  10;
        testData2[1] = 3;
        testData2[2] = 2;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertFalse(areSimilar.areSimilar2(testData1, testData2));
    }

    @Test
    public void test8(){
        int[] testData1 = new int[3];
        testData1[0] =  4;
        testData1[1] = 6;
        testData1[2] = 3;


        int[] testData2 = new int[3];
        testData2[0] =  3;
        testData2[1] = 4;
        testData2[2] = 6;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertFalse(areSimilar.areSimilar2(testData1, testData2));
    }

    /**
     * a: [832, 998, 148, 570, 533, 561, 894, 147, 455, 279]
     * b: [832, 998, 148, 570, 533, 561, 455, 147, 894, 279]
     */
    @Test
    public void test9(){
        int[] testData1 = new int[10];
        testData1[0] =  832;
        testData1[1] = 998;
        testData1[2] = 148;
        testData1[3] = 570;
        testData1[4] = 533;
        testData1[5] = 561;
        testData1[6] = 894;
        testData1[7] = 147;
        testData1[8] = 455;
        testData1[9] = 279;


        //b: [832, 998, 148, 570, 533, 561, 455, 147, 894, 279]
        int[] testData2 = new int[10];
        testData2[0] =  832;
        testData2[1] = 998;
        testData2[2] = 148;
        testData2[3] = 570;
        testData2[4] = 533;
        testData2[5] = 561;
        testData2[6] = 455;
        testData2[7] = 147;
        testData2[8] = 894;
        testData2[9] = 279;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertTrue(areSimilar.areSimilar2(testData1, testData2));
    }

    /**
     * a: [832, 998, 148, 570, 533, 561, 894, 147, 455, 279]
     * b: [832, 998, 148, 570, 533, 561, 455, 147, 894, 279]
     */
    @Test
    public void test10(){
        int[] testData1 = new int[10];
        testData1[0] =  832;
        testData1[1] = 998;
        testData1[2] = 148;
        testData1[3] = 570;
        testData1[4] = 533;
        testData1[5] = 561;
        testData1[6] = 894;
        testData1[7] = 147;
        testData1[8] = 455;
        testData1[9] = 279;


        //b: [832, 570, 148, 998, 533, 561, 455, 147, 894, 279]
        int[] testData2 = new int[10];
        testData2[0] =  832;
        testData2[1] = 570;
        testData2[2] = 148;
        testData2[3] = 998;
        testData2[4] = 533;
        testData2[5] = 561;
        testData2[6] = 455;
        testData2[7] = 147;
        testData2[8] = 894;
        testData2[9] = 279;

        AreSimilar areSimilar = new AreSimilar();
        Assert.assertFalse(areSimilar.areSimilar2(testData1, testData2));
    }
}



