package are.equally.strong;

/**
 * Call two arms equally strong if the heaviest weights they each are able to lift are equal.
 *
 * Call two people equally strong if their strongest arms are equally strong (the strongest arm
 * can be both the right and the left), and so are their weakest arms.
 *
 * Given your and your friend's arms' lifting capabilities find out if you two are equally strong.
 */
public class Strength {


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
    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        int[] arms = new int[4];

        arms[0] = yourLeft;
        arms[1] = yourRight;
        arms[2] = friendsLeft;
        arms[3] = friendsRight;

        int matchingConditions = 0;
        int firstWieght = 0;
        int secondWieght = 0;
        for(int i = 0; i < arms.length; i++){
            if(i == 0){
                firstWieght = arms[0];
            }else if(i == 1){
                secondWieght = arms[1];
            }else if(i>=2){
                if(firstWieght == arms[i] || secondWieght == arms[i]){
                    matchingConditions++;
                }
            }
        }

        if(matchingConditions == 2){
            return true;
        }else{
            return false;
        }
    }
}
