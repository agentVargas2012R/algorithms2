package different.symbols.naive;

import org.junit.Assert;
import org.junit.Test;

public class DifferentSymbolsNaiveTest {

    private DifferentSymbolsNaiveContainer differentSymbolsNaiveContainer = new DifferentSymbolsNaiveContainer();
    /**
     * Input:
     *  s: "cabca"
     *
     * Expected Output:
     *  3
     */
    @Test
    public void test1() {
        String s = "cabca";
        int pass = 3;

        int output = differentSymbolsNaiveContainer.differentSymbolsNaive(s);
        Assert.assertTrue("String s: " + s + " should have " + pass +
                                " + instaed of " + output, pass == output);
    }

    @Test
    public void test2() {
        String s = "aba";
        int pass = 2;

        int output = differentSymbolsNaiveContainer.differentSymbolsNaive(s);
        Assert.assertTrue("String s: " + s + " should have " + pass +
                " + instaed of " + output, pass == output);
    }

    @Test
    public void test3() {
        String s = "ccccccccccc";
        int pass = 1;

        int output = differentSymbolsNaiveContainer.differentSymbolsNaive(s);
        Assert.assertTrue("String s: " + s + " should have " + pass +
                " + instaed of " + output, pass == output);
    }

    @Test
    public void test4() {
        String s = "bcaba";
        int pass = 3;

        int output = differentSymbolsNaiveContainer.differentSymbolsNaive(s);
        Assert.assertTrue("String s: " + s + " should have " + pass +
                " + instaed of " + output, pass == output);
    }

    @Test
    public void test6() {
        String s = "codesignal";
        int pass = 10;

        int output = differentSymbolsNaiveContainer.differentSymbolsNaive(s);
        Assert.assertTrue("String s: " + s + " should have " + pass +
                " + instaed of " + output, pass == output);
    }
}
