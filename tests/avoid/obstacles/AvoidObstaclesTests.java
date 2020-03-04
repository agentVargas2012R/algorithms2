package avoid.obstacles;

import org.junit.Assert;
import org.junit.Test;

public class AvoidObstaclesTests {

    private Obstacles obstacles = new Obstacles();

    /**
     * Input:
     * inputArray: [5, 3, 6, 7, 9]
     *
     * Expected Output:  4
     */
    @Test
    public void test1() {
        int[] inputArray = new int[5];
        inputArray[0] = 5;
        inputArray[1] = 3;
        inputArray[2] = 6;
        inputArray[3] = 7;
        inputArray[4] = 9;

        int answer = obstacles.avoidObstacles(inputArray);
        int pass = 4;

        if(answer == pass){
            Assert.assertTrue("Answer is: " + answer, true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }

    /**
     * Input:
     *
     * inputArray: [2, 3]
     *
     * Expected Output:  4
     */
    @Test
    public void test2() {
        int[] inputArray = new int[2];
        inputArray[0] = 2;
        inputArray[1] = 3;

        int answer = obstacles.avoidObstacles(inputArray);
        int pass = 4;

        if(answer == pass){
            Assert.assertTrue("Answer is: " + answer, true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }

    /**
     * Input:
     * inputArray: [1, 4, 10, 6, 2]
     *
     * Expected Output: 7
     */
    @Test
    public void test3() {
        int[] inputArray = new int[5];
        inputArray[0] = 1;
        inputArray[1] = 4;
        inputArray[2] = 10;
        inputArray[3] = 6;
        inputArray[4] = 2;

        int answer = obstacles.avoidObstacles(inputArray);
        int pass = 7;

        if(answer == pass){
            Assert.assertTrue("Passed", true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }

    /**
     * Input:
     *
     * inputArray: [1000, 999]
     * Expected Output:   6
     */
    @Test
    public void test4() {
        int[] inputArray = new int[2];
        inputArray[0] = 1000;
        inputArray[1] = 999;

        int answer = obstacles.avoidObstacles(inputArray);
        int pass = 6;

        if(answer == pass){
            Assert.assertTrue("Passed", true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }

    /**
     * Input:
     *
     * inputArray: [19, 32, 11, 23]
     * Expected Output:  3
     */
    public void test5() {
        int[] inputArray = new int[5];
        inputArray[0] = 19;
        inputArray[1] = 32;
        inputArray[2] = 11;
        inputArray[3] = 23;

        int answer = obstacles.avoidObstacles(inputArray);
        int pass = 3;

        if(answer == pass){
            Assert.assertTrue("Passed", true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }

    /**
     * Input:
     *
     * inputArray: [5, 8, 9, 13, 14]
     * Expected Output: 6
     */
    @Test
    public void test6() {
        int[] inputArray = new int[5];
        inputArray[0] = 5;
        inputArray[1] = 8;
        inputArray[2] = 9;
        inputArray[3] = 13;
        inputArray[4] = 14;

        int answer = obstacles.avoidObstacles(inputArray);
        int pass = 6;

        if(answer == pass){
            Assert.assertTrue("Passed", true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }
}
