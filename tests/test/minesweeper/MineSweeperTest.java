package test.minesweeper;

import com.minesweeper.MineSweeperContainer;
import org.junit.Test;

public class MineSweeperTest {

    private MineSweeperContainer container = new MineSweeperContainer();
    /**
     * matrix:
     * [[true,false,false],
     *  [false,true,false],
     *  [false,false,false]]
     *
     *  Expected Output:
     *  [[1,2,1],
     *  [2,1,1],
     *  [1,1,1]]
     */
    @Test
    public void test1() {

        Boolean[][] matrix = new Boolean[3][3];
        matrix[0][0] = true;
        matrix[0][1] = false;
        matrix[0][2] = false;
        matrix[1][0] = false;
        matrix[1][1] = true;
        matrix[1][2] = false;
        matrix[2][0] = false;
        matrix[2][1] = false;
        matrix[2][2] = false;

        int[][] result = container.minesweeper(matrix);
        System.out.println("Test");
    }


}
