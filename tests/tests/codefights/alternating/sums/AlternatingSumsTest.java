package tests.codefights.alternating.sums;

import alternating.sums.AlternatingSums;
import org.junit.Assert;
import org.junit.Test;


public class AlternatingSumsTest {

    //[50, 60, 60, 45, 70],
    @Test
    public void test1(){
        int[] testData = new int[5];
        testData[0] = 50;
        testData[1] = 60;
        testData[2] = 60;
        testData[3] = 45;
        testData[4] = 70;

        int[] pass = new int[2];
        pass[0] = 180;
        pass[1] = 105;


        AlternatingSums altSums = new AlternatingSums();
        int[] result = altSums.alternatingSums(testData);
        Assert.assertTrue(pass[0] == result[0]);
        Assert.assertTrue(pass[1] == result[1]);

    }

    //[100, 50]
    @Test
    public void test2() {
        int[] testData = new int[2];
        testData[0] = 100;
        testData[1] = 50;

        int[] pass = new int[2];
        pass[0] = 100;
        pass[1] = 50;


        AlternatingSums altSums = new AlternatingSums();
        int[] result = altSums.alternatingSums(testData);
        Assert.assertTrue(pass[0] == result[0]);
        Assert.assertTrue(pass[1] == result[1]);
    }
    //[80]
    //output: [80, 0]
    @Test
    public void test3() {
        int[] testData = new int[1];
        testData[0] = 80;


        int[] pass = new int[2];
        pass[0] = 80;
        pass[1] = 0;


        AlternatingSums altSums = new AlternatingSums();
        int[] result = altSums.alternatingSums(testData);
        Assert.assertTrue(pass[0] == result[0]);
        Assert.assertTrue(pass[1] == result[1]);
    }

    //[100, 50, 50, 100]
    //output: [150, 150]
    @Test
    public void test4(){
        int[] testData = new int[4];
        testData[0] = 100;
        testData[1] = 50;
        testData[2] = 50;
        testData[3] = 100;

        int[] pass = new int[2];
        pass[0] = 150;
        pass[1] = 150;

        AlternatingSums altSums = new AlternatingSums();
        int[] result = altSums.alternatingSums(testData);
        Assert.assertTrue(pass[0] == result[0]);
        Assert.assertTrue(pass[1] == result[1]);
    }

    //[100, 51, 50, 100]
    //@output: [150, 151]
    @Test
    public void test5(){
        int[] testData = new int[4];
        testData[0] = 100;
        testData[1] = 51;
        testData[2] = 50;
        testData[3] = 100;

        int[] pass = new int[2];
        pass[0] = 150;
        pass[1] = 151;

        AlternatingSums altSums = new AlternatingSums();
        int[] result = altSums.alternatingSums(testData);
        Assert.assertTrue(pass[0] == result[0]);
        Assert.assertTrue(pass[1] == result[1]);
    }
}
