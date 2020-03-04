package avoid.obstacles;

/**
 * You are given an array of integers representing coordinates of obstacles situated on a straight line.
 * Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make
 * jumps of the same length represented by some integer.
 *
 * Find the minimal length of the jump enough to avoid all the obstacles.
 */
public class Obstacles {

    /**
     * What is the first integer after 1 which none of the elements in the array can be evenly divided by?
     * Sorting the array is not needed and won't help.
     *
     * inputArray: [5, 3, 6, 7, 9]
     *
     * @param inputArray
     * @return
     */
    public int avoidObstacles(int[] inputArray) {
        inputArray = bubbleSort(inputArray);

        int minimumLength = 0;
        for(int k = 2; k < inputArray[inputArray.length - 1]; k++) {
            boolean breakLoop = false;
            int checks = 0;
            for (int i = 0; i < inputArray.length; i++) {
                int answer = inputArray[i] % k;
                if(answer == 0){
                    System.out.println("The Answer Is Not: " + k);
                    break;
                }else{
                    checks++;
                }

                if(checks == inputArray.length){
                    breakLoop = true;
                }
            }

            if(breakLoop){
                minimumLength = k;
                break;
            }
        }

        if(minimumLength == 0){
            minimumLength = inputArray[inputArray.length - 1] + 1;
        }

        return minimumLength;
    }

    int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;
    }
}
