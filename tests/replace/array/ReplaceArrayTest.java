package replace.array;

import org.junit.Assert;
import org.junit.Test;

public class ReplaceArrayTest {


    private ReplaceArrayContainer container = new ReplaceArrayContainer();

    /**
     * Input:
     *
     * inputArray: [1, 2, 1, 2, 1]
     * elemToReplace: 2
     * substitutionElem: 1
     *
     * Expected Output:
     * [1, 1, 1, 1, 1]
     */
    @Test
    public void test1() {
        int[] inputArray = new int[5];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 1;
        inputArray[3] = 2;
        inputArray[4] = 1;

        int[] pass = new int[5];
        pass[0] = 1;
        pass[1] = 1;
        pass[2] = 1;
        pass[3] = 1;
        pass[4] = 1;

        int elemToReplace = 2;
        int substitutionElem = 1;

        int result[] = container.arrayReplace(inputArray, elemToReplace, substitutionElem);
        for(int i = 0; i < result.length; i++) {
            if(result[i] != pass[i]) {
                Assert.fail("Unexpected Element Found At Position: " + i + " for result["+i+"] =" + result[i] +
                    " should be " + pass[i]);
            }
        }

    }

    /**
     * Input:
     *
     * inputArray: [1, 2, 3, 4, 5]
     * elemToReplace: 3
     * substitutionElem: 0
     *
     * Expected Output:
     * [1, 2, 0, 4, 5]
     */
    @Test
    public void test2() {
        int[] inputArray = new int[5];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 3;
        inputArray[3] = 4;
        inputArray[4] = 5;

        int[] pass = new int[5];
        pass[0] = 1;
        pass[1] = 2;
        pass[2] = 0;
        pass[3] = 4;
        pass[4] = 5;

        int elemToReplace = 3;
        int substitutionElem = 0;

        int result[] = container.arrayReplace(inputArray, elemToReplace, substitutionElem);
        for(int i = 0; i < result.length; i++) {
            if(result[i] != pass[i]) {
                Assert.fail("Unexpected Element Found At Position: " + i + " for result["+i+"] =" + result[i] +
                        " should be " + pass[i]);
            }
        }
    }

    /**
     * Input:
     *
     * inputArray: [1, 1, 1]
     * elemToReplace: 1
     * substitutionElem: 10
     *
     * Expected Output:
     * [10, 10, 10]
     */
    @Test
    public void test3() {
        int[] inputArray = new int[3];
        inputArray[0] = 1;
        inputArray[1] = 1;
        inputArray[2] = 1;

        int[] pass = new int[3];
        pass[0] = 10;
        pass[1] = 10;
        pass[2] = 10;


        int elemToReplace = 1;
        int substitutionElem = 10;

        int result[] = container.arrayReplace(inputArray, elemToReplace, substitutionElem);
        for(int i = 0; i < result.length; i++) {
            if(result[i] != pass[i]) {
                Assert.fail("Unexpected Element Found At Position: " + i + " for result["+i+"] =" + result[i] +
                        " should be " + pass[i]);
            }
        }
    }
}
