package array.max.consecutive.sum;

public class ArrayMaxConsecutiveSumContainer {

    public int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int maxIterator = inputArray.length - k + 1;
        int maxNum = 0;

        for(int i = 0; i < maxIterator; i++) {
            int total = 0;
            for(int j = i; j < k+i; j++){
                total = total + inputArray[j];

            }
            if(total > maxNum){
                maxNum = total;
            }
        }

        return maxNum;
    }

}
