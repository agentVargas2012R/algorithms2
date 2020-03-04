package box.blur;


import org.junit.Assert;
import org.junit.Test;

/**
 * The pixels in the input image are represented as integers. The algorithm
 * distorts the input image in the following way: Every pixel x in the output
 * image has a value equal to the average value of the pixel values from the 3 × 3 square
 * that has its center at x, including x itself. All the pixels on the border of x are then removed.
 *
 * Return the blurred image as an integer, with the fractions rounded down.
 */
public class ImageDistortionTest {

    private ImageDistortion imageDistortion = new ImageDistortion();
    /**
     * Input:
     *
     * image:
     *  [[1,1,1],
     *  [1,7,1],
     *  [1,1,1]]
     *
     *  Expected Output:
     *  [[1]]
     *
     *  Step 1: (1+1+1+1+7+1+1+1+1)/9 = 1.666
     *  Step 2: Math.floor(1.67) = 1;
     */
    @Test
    public void test1() {
        int[][] image = new int[3][3];
        image[0][0] = 1;
        image[0][1] = 1;
        image[0][2] = 1;
        image[1][0] = 1;
        image[1][1] = 7;
        image[1][2] = 1;
        image[2][0] = 1;
        image[2][1] = 1;
        image[2][2] = 1;

        int[][] result = imageDistortion.boxBlur(image);
        int[][] pass = new int[1][1];
        pass[0][0] = 1;

        boolean checkLength = false;
        boolean checkWidth = false;
        boolean checkelement = false;

        //check the length of the elements
        if(pass.length == result.length){
            checkLength = true;
        }

        if(pass[0].length == result[0].length){
            checkWidth = true;
        }

        if(pass[0][0] == result[0][0]){
            checkelement = true;
        }

        if(checkLength && checkelement && checkWidth){
            Assert.assertTrue("Passed", true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }

    /**
     *
     * image = [    [7, 4, 0, 1],
     *              [5, 6, 2, 2],
     *              [6, 10, 7, 8],
     *              [1, 4, 2, 0]]
     */
    @Test
    public void test2() {
        int[][] image = new int[4][4];
        image[0][0] = 7;
        image[0][1] = 4;
        image[0][2] = 0;
        image[0][3] = 1;
        image[1][0] = 5;
        image[1][1] = 6;
        image[1][2] = 2;
        image[1][3] = 2;
        image[2][0] = 6;
        image[2][1] = 10;
        image[2][2] = 7;
        image[2][3] = 8;
        image[3][0] = 1;
        image[3][1] = 4;
        image[3][2] = 2;
        image[3][3] = 0;

        int[][] result = imageDistortion.boxBlur(image);
        int[][] pass = new int[2][2];
        pass[0][0] = 5;
        pass[0][1] = 4;
        pass[1][0] = 4;
        pass[1][1] = 4;

        boolean checkLength = false;
        boolean checkWidth = false;
        boolean checkelement = true;

        //check the length of the elements
        if(pass.length == result.length){
            checkLength = true;
        }

        if(pass[0].length == result[0].length){
            checkWidth = true;
        }

        for(int i = 0; i < result.length; i++){
            for(int y = 0; y < result[0].length; y++){
                if(pass[i][y] != result[i][y]){
                    checkelement = false;
                }
            }
        }

        if(checkLength && checkelement && checkWidth){
            Assert.assertTrue("Passed", true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }

    /**
     * Input:
     * image:
     *                  [[36,0,18,9],
     *                   [27,54,9,0],
     *                   [81,63,72,45]]
     *
     * Expected Output:
     *                  [[40,30]]
     *
     * Console Output:
     *                  Empty
     */
    @Test
    public void test4() {
        int[][] image = new int[3][4];
        image[0][0] = 36;
        image[0][1] = 0;
        image[0][2] = 18;
        image[0][3] = 9;

        image[1][0] = 27;
        image[1][1] = 54;
        image[1][2] = 9;
        image[1][3] = 0;

        image[2][0] = 81;
        image[2][1] = 63;
        image[2][2] = 72;
        image[2][3] = 45;

        int[][] result = imageDistortion.boxBlur(image);
        int[][] pass = new int[1][2];
        pass[0][0] = 40;
        pass[0][1] = 30;

        boolean checkLength = false;
        boolean checkWidth = false;
        boolean checkelement = true;

        //check the length of the elements
        if(pass.length == result.length){
            checkLength = true;
        }

        if(pass[0].length == result[0].length){
            checkWidth = true;
        }

        for(int x = 0; x < result.length; x++){
            for(int y = 0; y < result[0].length; y++) {
                if (pass[x][y] != result[x][y]) {
                    checkelement = false;
                }
            }
        }

        if(checkLength && checkelement && checkWidth){
            Assert.assertTrue("Passed", true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }

    /**
     * Recommendation for anyone having trouble with the hidden tests..
     * watch out for floating point precision issues. I moved my division from the inner loop
     * to the outer loop which pushed just one of the values in one of the hidden tests from 127 to 128
     * (127 was incorrect).
     */
    @Test
    public void test7() {
        int[][] image = new int[4][3];
        image[0][0] = 36;
        image[0][1] = 0;
        image[0][2] = 18;

        image[1][0] = 36;
        image[1][1] = 0;
        image[1][2] = 18;

        image[2][0] = 36;
        image[2][1] = 0;
        image[2][2] = 18;

        image[3][0] = 36;
        image[3][1] = 0;
        image[3][2] = 18;

        int[][] result = imageDistortion.boxBlur(image);
        int[][] pass = new int[1][2];
        pass[0][0] = 18;
        pass[0][1] = 6;

        boolean checkLength = false;
        boolean checkWidth = false;
        boolean checkelement = true;

        //check the length of the elements
        if(pass.length == result.length){
            checkLength = true;
        }

        if(pass[0].length == result[0].length){
            checkWidth = true;
        }

        for(int x = 0; x < result.length; x++){
            for(int y = 0; y < result[0].length; y++) {
                if (pass[x][y] != result[x][y]) {
                    checkelement = false;
                }
            }
        }

        if(checkLength && checkelement && checkWidth){
            Assert.assertTrue("Passed", true);
        }else{
            Assert.assertTrue("Failed", false);
        }
    }

    @Test
    public void test8() {
        int[][] image = new int[2][2];
        image[0][0] = 5;
        image[0][0] = 4;

        image[1][0] = 5;
        image[1][0] = 4;

        int[][] result = imageDistortion.boxBlur(image);
        int[][] pass = new int[2][2];

        pass[0][0] = 18;
        pass[0][1] = 6;

    }
}
