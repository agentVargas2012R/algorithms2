package array.change;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayChangeTest {

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    //[1, 1, 1]
    @Test
    public void test1(){
        ArrayChange change = new ArrayChange();
        int[] inputArray = new int[3];


        inputArray[0] = 1;
        inputArray[1] = 1;
        inputArray[2] = 1;

        int pass = 3;
        int result = change.arrayChange(inputArray);

        assert(pass == result);
    }

    //[-1000, 0, -2, 0]
    @Test
    public void test2(){
        ArrayChange change = new ArrayChange();
        int[] inputArray = new int[4];


        inputArray[0] = -1000;
        inputArray[1] = 0;
        inputArray[2] = -2;
        inputArray[3] = 0;

        int pass = 12;
        int result = change.arrayChange(inputArray);

        assert(pass == result);
    }

    //inputArray: [2, 1, 10, 1]
    @Test
    public void test3(){
        ArrayChange change = new ArrayChange();
        int[] inputArray = new int[4];


        inputArray[0] = 2;
        inputArray[1] = 1;
        inputArray[2] = 10;
        inputArray[3] = 1;

        int pass = 12;
        int result = change.arrayChange(inputArray);

        assert(pass == result);
    }

    //inputArray: [2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15]
    @Test
    public void test4(){
        ArrayChange change = new ArrayChange();
        int[] inputArray = new int[11];


        inputArray[0] = 2;
        inputArray[1] = 3;
        inputArray[2] = 3;
        inputArray[3] = 5;
        inputArray[4] = 5;
        inputArray[5] = 5;
        inputArray[6] = 4;
        inputArray[7] = 12;
        inputArray[8] = 12;
        inputArray[9] = 10;
        inputArray[10] = 15;


        int pass = 13;
        int result = change.arrayChange(inputArray);

        assert(pass == result);
    }
}
