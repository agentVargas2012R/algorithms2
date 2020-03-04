package are.equally.strong;


import org.junit.Assert;
import org.junit.Test;

public class StrengthTest {

    /**
     *
     * For yourLeft = 10,
     * yourRight = 15,
     * friendsLeft = 15,
     * and friendsRight = 10,
     *
     * the output should be
     *      areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = true;
     */
    @Test
    public void test1(){


        Strength strength = new Strength();
        Boolean result = strength.areEquallyStrong(10, 15, 15, 10);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);
        Assert.assertTrue(result);
    }


    /**
     * For yourLeft = 15,
     * yourRight = 10,
     * friendsLeft = 15,
     * and friendsRight = 10,
     *
     * the output should be
     *     areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = true;
     */
    @Test
    public void test2(){
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();


        Strength strength = new Strength();
        Boolean result = strength.areEquallyStrong(15, 10, 15, 10);

        System.out.println(methodName + " : " + result);

        Assert.assertTrue(result);
    }

    /**
     * For yourLeft = 15,
     * yourRight = 10,
     * friendsLeft = 15,
     * and friendsRight = 9,
     *
     * the output should be
     *  areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = false.
     */
    @Test
    public void test3(){
        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();

        Strength strength = new Strength();
        Boolean result = strength.areEquallyStrong(15, 10, 15, 9);

        System.out.println(methodName + " : " + result);

        Assert.assertTrue(!result);
    }
}
