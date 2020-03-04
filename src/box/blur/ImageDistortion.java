package box.blur;

/**
 * Last night you partied a little too hard. Now there's a black and white photo of you that's
 * about to go viral! You can't let this ruin your reputation, so you want to apply the box blur
 * algorithm to the photo to hide its content.
 *
 * The pixels in the input image are represented as integers. The algorithm distorts the input image
 * in the following way: Every pixel x in the output image has a value equal to the average value of
 * the pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels
 * on the border of x are then removed.
 *
 * Return the blurred image as an integer, with the fractions rounded down.
 */
public class ImageDistortion {

    public int[][] boxBlur(int[][] image) {
        //need to figure out the size based on formula
        int[][] imageArray = new int[image.length - 2][image[0].length - 2];

        for(int x = 0; x < image.length - 2; x++) {
            for(int y = 0; y < image[0].length -2; y++) {
                int sum = 0;
                for (int a = x; a < x + 3; a++) {
                    for (int b = y; b < y + 3; b++) {
                        sum = sum + image[a][b];
                    }
                }
                int total = (int) Math.floor(sum/9.0);
                imageArray[x][y] = total;
            }
        }

        return imageArray;
    }
}
