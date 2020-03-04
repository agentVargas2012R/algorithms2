package is.ipv4.address;

import org.junit.Assert;
import org.junit.Test;

public class RouterTest {

    /**
     * For inputString = "172.16.254.1",
     *
     * the output should be
     *     isIPv4Address(inputString) = true;
     */
    @Test
    public void test1(){

        Boolean pass = true;
        String inputString = "172.16.254.1";

        Router router = new Router();
        Boolean result = router.isIPv4Address(inputString);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(pass == result);
    }

    /**
     * For inputString = "172.16.254.1",
     *
     * the output should be
     *     isIPv4Address(inputString) = true;
     */
    @Test
    public void test2(){

        Boolean pass = false;
        String inputString = ".254.255.0";

        Router router = new Router();
        Boolean result = router.isIPv4Address(inputString);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(pass == result);
    }

    /**
     * For inputString =  ".254.255.0"
     *
     * the output should be
     *     isIPv4Address(inputString) = true;
     */
    @Test
    public void test3(){

        Boolean pass = false;
        String inputString =  ".254.255.0";

        Router router = new Router();
        Boolean result = router.isIPv4Address(inputString);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(pass == result);
    }

    /**
     * For inputString =  "1.1.1.1a"
     *
     * the output should be
     *     isIPv4Address(inputString) = true;
     */
    @Test
    public void test4(){

        Boolean pass = false;
        String inputString =  "1.1.1.1a";

        Router router = new Router();
        Boolean result = router.isIPv4Address(inputString);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        Assert.assertTrue(pass == result);
    }


    /**
     * For inputString =  "1"
     *
     * the output should be
     *     isIPv4Address(inputString) = false;
     */
    @Test
    public void test5(){

        Boolean pass = false;
        String inputString =  "1";

        Router router = new Router();
        Boolean result = router.isIPv4Address(inputString);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(pass == result);
    }

    /**
     * For inputString =  "0.254.255.0"
     *
     * the output should be
     *     isIPv4Address(inputString) = false;
     */
    @Test
    public void test6(){

        Boolean pass = true;
        String inputString =  "0.254.255.0";

        Router router = new Router();
        Boolean result = router.isIPv4Address(inputString);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(pass == result);
    }


    /**
     * For inputString =  "1.23.256.255."
     *
     * the output should be
     *     isIPv4Address(inputString) = false;
     */
    @Test
    public void test7(){

        Boolean pass = false;
        String inputString =  "1.23.256.255.";

        Router router = new Router();
        Boolean result = router.isIPv4Address(inputString);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(pass == result);
    }

    /**
     * For inputString =  "1.23.256.."
     *
     * the output should be
     *     isIPv4Address(inputString) = false;
     */
    @Test
    public void test8(){

        Boolean pass = false;
        String inputString =  "1.23.256..";

        Router router = new Router();
        Boolean result = router.isIPv4Address(inputString);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(pass == result);
    }


    /**
     * For inputString =  "0..1.0"
     *
     * the output should be
     *     isIPv4Address(inputString) = false;
     */
    @Test
    public void test9(){

        Boolean pass = false;
        String inputString =  "0..1.0";

        Router router = new Router();
        Boolean result = router.isIPv4Address(inputString);

        String methodName = new Object() {}
                .getClass()
                .getEnclosingMethod()
                .getName();
        System.out.println(methodName + " : " + result);

        Assert.assertTrue(pass == result);
    }
}
