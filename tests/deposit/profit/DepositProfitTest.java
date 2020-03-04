package deposit.profit;

import org.junit.Assert;
import org.junit.Test;

public class DepositProfitTest {

    private DepositProfitContainer depositProfitContainer = new DepositProfitContainer();
    /**
     * For deposit = 100, rate = 20, and threshold = 170, the output should be
     depositProfit(deposit, rate, threshold) = 3.

     Each year the amount of money in your account increases by 20%. So throughout the years, your balance would be:

     year 0: 100;
     year 1: 120;
     year 2: 144;
     year 3: 172.8.
     Thus, it will take 3 years for your balance to pass the threshold, so the answer is 3.
     */
    @Test
    public void test1() {
        int deposit = 100;
        int rate = 20;
        int threshold = 170;
        int pass = 3;

        int result = depositProfitContainer.depositProfit(deposit, rate, threshold);

        Assert.assertTrue("The deposit amount of " + deposit + " with a rate of " + rate +
                " to a threshold of " + threshold + " should be equal to " + pass + " instead of " + result,result == pass);
    }

    /**
     * Input:
     *  deposit: 100
     *  rate: 1
     *  threshold: 101
     *
     * Expected Output:
     *  1
     */
    @Test
    public void test2() {
        int deposit = 100;
        int rate = 1;
        int threshold = 101;
        int pass = 1;

        int result = depositProfitContainer.depositProfit(deposit, rate, threshold);

        Assert.assertTrue("The deposit amount of " + deposit + " with a rate of " + rate +
                " to a threshold of " + threshold + " should be equal to " + pass + " instead of " + result,result == pass);
    }

    @Test
    public void test3() {
        int deposit = 1;
        int rate = 100;
        int threshold = 64;
        int pass = 6;

        int result = depositProfitContainer.depositProfit(deposit, rate, threshold);

        Assert.assertTrue("The deposit amount of " + deposit + " with a rate of " + rate +
                " to a threshold of " + threshold + " should be equal to " + pass + " instead of " + result,result == pass);
    }

    @Test
    public void test4() {
        int deposit = 20;
        int rate = 20;
        int threshold = 50;
        int pass = 6;

        int result = depositProfitContainer.depositProfit(deposit, rate, threshold);

        Assert.assertTrue("The deposit amount of " + deposit + " with a rate of " + rate +
                " to a threshold of " + threshold + " should be equal to " + pass + " instead of " + result,result == pass);
    }

    @Test
    public void test5() {
        int deposit = 50;
        int rate = 25;
        int threshold = 100;
        int pass = 4;

        int result = depositProfitContainer.depositProfit(deposit, rate, threshold);

        Assert.assertTrue("The deposit amount of " + deposit + " with a rate of " + rate +
                " to a threshold of " + threshold + " should be equal to " + pass + " instead of " + result,result == pass);
    }
}


