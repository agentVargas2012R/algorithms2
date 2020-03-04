package array.max.adj.diff;

/**
 * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
 */
public class AdjacentDifference {

    /**
     * For inputArray = [2, 4, 1, 0],
     *
     * the output should be arrayMaximalAdjacentDifference(inputArray) = 3.
     */
    public int arrayMaximalAdjacentDifference(int[] inputArray) {

        int diff = 0;
        for(int i = 0; i < inputArray.length; i++){
            if(i==0){
                continue;
            }else{
                int j = i -1;
                int currentDifference = Math.abs(inputArray[i] - inputArray[j]);
                if(currentDifference > diff){
                    diff = currentDifference;
                }
            }
        }

        return diff;
    }
}
