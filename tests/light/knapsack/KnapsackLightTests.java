package light.knapsack;

import knpasack.light.KnapsackLightContainer;
import org.junit.Assert;
import org.junit.Test;

/**
 * You found two items in a treasure chest! The first item weighs weight1 and is worth value1,
 * and the second item weighs weight2 and is worth value2. What is the total maximum value of the items
 * you can take with you, assuming that your max weight capacity is maxW and you can't come back for the items later?
 *
 * Note that there are only two items and you can't bring more than one item of each type, i.e.
 * you can't take two first items or two second items.

 */
public class KnapsackLightTests {

    private KnapsackLightContainer knapsackLightContainer = new KnapsackLightContainer();

    /**
     * Input:
     *  value1: 10
     *  weight1 5
     *
     *  value2: 6
     *  weight2: 4
     *
     *  maxW: 8
     *
     * output: 10
     *
     * For value1 = 10, weight1 = 5, value2 = 6, weight2 = 4, and maxW = 8, the output should be
     * knapsackLight(value1, weight1, value2, weight2, maxW) = 10.
     */
    @Test
    public void test1() {


        int value1 = 10;
        int weight1 = 5;
        int value2 = 6;
        int weight2 = 4;
        int maxW = 8;

        int pass = 10;

        int result = knapsackLightContainer.knapsackLight(value1, weight1, value2, weight2, maxW);

        Assert.assertSame(pass, result);
    }

    @Test
    public void test2() {


        int value1 = 10;
        int weight1 = 5;
        int value2 = 6;
        int weight2 = 4;
        int maxW = 9;

        int pass = 16;

        int result = knapsackLightContainer.knapsackLight(value1, weight1, value2, weight2, maxW);

        Assert.assertSame(pass, result);
    }


    @Test
    public void test3() {


        int value1 = 5;
        int weight1 = 3;
        int value2 = 7;
        int weight2 = 4;
        int maxW = 6;

        int pass = 7;

        int result = knapsackLightContainer.knapsackLight(value1, weight1, value2, weight2, maxW);

        System.out.println("Pass: " + pass + " Result: " + result);
        Assert.assertSame(pass, result);
    }

    @Test
    public void test4() {


        int value1 = 10;
        int weight1 = 2;
        int value2 = 11;
        int weight2 = 5;
        int maxW = 1;

        int pass = 0;

        int result = knapsackLightContainer.knapsackLight(value1, weight1, value2, weight2, maxW);

        System.out.println("Pass: " + pass + " Result: " + result);
        Assert.assertSame(pass, result);
    }

    @Test
    public void test5() {


        int value1 = 15;
        int weight1 = 2;
        int value2 = 20;
        int weight2 = 5;
        int maxW = 2;

        int pass = 15;

        int result = knapsackLightContainer.knapsackLight(value1, weight1, value2, weight2, maxW);

        System.out.println("Pass: " + pass + " Result: " + result);
        Assert.assertSame(pass, result);
    }

    @Test
    public void test6() {
        int value1 = 2;
        int weight1 = 5;
        int value2 = 3;
        int weight2 = 4;
        int maxW = 5;

        int pass = 3;

        int result = knapsackLightContainer.knapsackLight(value1, weight1, value2, weight2, maxW);

        System.out.println("Pass: " + pass + " Result: " + result);
        Assert.assertSame(pass, result);
    }


    /**
     * value1: 3
     * weight1: 4
     * value2: 5
     * weight2: 3
     * maxW: 3
     */
    @Test
    public void test7() {
        int value1 = 3;
        int weight1 = 4;
        int value2 = 5;
        int weight2 = 3;
        int maxW = 3;

        int pass = 5;

        int result = knapsackLightContainer.knapsackLight(value1, weight1, value2, weight2, maxW);

        System.out.println("Pass: " + pass + " Result: " + result);
        Assert.assertSame(pass, result);
    }

    /**
     *
     *  value1: 5
     *  weight1: 2
     *  value2: 4
     *  weight2: 2
     *  maxW: 20
     */
    @Test
    public void test8() {
        int value1 = 5;
        int weight1 = 2;
        int value2 = 4;
        int weight2 = 2;
        int maxW = 20;

        int pass = 9;

        int result = knapsackLightContainer.knapsackLight(value1, weight1, value2, weight2, maxW);

        System.out.println("Pass: " + pass + " Result: " + result);
        Assert.assertSame(pass, result);
    }
}
