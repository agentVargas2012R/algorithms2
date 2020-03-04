package absolute.value.sum.minimization;

/**
 * Given a sorted array of integers a, your task is to determine which element of a is closest to all other values of a.
 * In other words, find the element x in a, which minimizes the following sum:
 *
 * abs(a[0] - x) + abs(a1] -x) + ...
 *
 * If there are several possible answers, output the smallest one.
 **/
public class AbsoluteValuesSumMinimizationContainer {

    public int absoluteValuesSumMinimization(int[] a) {

        int answer = 0;
        int bestAnswer = 0;
        int bestValue = 0;

        for(int i =0; i < a.length; i++){

            int currentAnswer = 0;
            int currentElement = a[i];

            for(int j = 0; j < a.length; j++){
                currentAnswer = currentAnswer + Math.abs(currentElement - a[j]);
            }

            if(i > 0){
                if(currentAnswer < bestAnswer){
                    bestAnswer = currentAnswer;
                    bestValue = a[i];
                }
            }else{
                bestAnswer = currentAnswer;
                bestValue = a[i];
            }
        }

        return bestValue;
    }

}
