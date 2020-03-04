package chess.board.cell.color;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardCellColorTest {

    private ChessBoardCellColorContainer chessBoardCellColorContainer = new ChessBoardCellColorContainer();


    @Test
    public void test1() {
        String cell1 = "A1";
        String cell2 = "C3";
        Boolean pass = true;

        Boolean result = chessBoardCellColorContainer.chessBoardCellColor(cell1, cell2);

        Assert.assertTrue("result for " + cell1 + " and cell2 " + cell2 + " should be " + pass,result == pass);
    }

    @Test
    public void test2() {
        String cell1 = "A1";
        String cell2 = "H3";
        Boolean pass = false;

        Boolean result = chessBoardCellColorContainer.chessBoardCellColor(cell1, cell2);

        Assert.assertTrue("result for " + cell1 + " and cell2 " + cell2 + " should be " + pass,result == pass);

    }

    @Test
    public void test4() {
        String cell1 = "A1";
        String cell2 = "A2";
        Boolean pass = false;

        Boolean result = chessBoardCellColorContainer.chessBoardCellColor(cell1, cell2);

        Assert.assertTrue("result for " + cell1 + " and cell2 " + cell2 + " should be " + pass,result == pass);

    }

    @Test
    public void test5() {
        String cell1 = "A1";
        String cell2 = "B2";
        Boolean pass = true;

        Boolean result = chessBoardCellColorContainer.chessBoardCellColor(cell1, cell2);

        Assert.assertTrue("result for " + cell1 + " and cell2 " + cell2 + " should be " + pass,result == pass);

    }

    @Test
    public void test6() {
        String cell1 = "C3";
        String cell2 = "B5";
        Boolean pass = false;

        Boolean result = chessBoardCellColorContainer.chessBoardCellColor(cell1, cell2);

        Assert.assertTrue("result for " + cell1 + " and cell2 " + cell2 + " should be " + pass,result == pass);

    }

    @Test
    public void test7() {
        String cell1 = "G5";
        String cell2 = "E7";
        Boolean pass = true;

        Boolean result = chessBoardCellColorContainer.chessBoardCellColor(cell1, cell2);

        Assert.assertTrue("result for " + cell1 + " and cell2 " + cell2 + " should be " + pass,result == pass);

    }

    @Test
    public void test8() {
        String cell1 = "C8";
        String cell2 = "H8";
        Boolean pass = false;

        Boolean result = chessBoardCellColorContainer.chessBoardCellColor(cell1, cell2);

        Assert.assertTrue("result for " + cell1 + " and cell2 " + cell2 + " should be " + pass,result == pass);

    }

    @Test
    public void test9() {
        String cell1 = "D2";
        String cell2 = "D2";
        Boolean pass = true;

        Boolean result = chessBoardCellColorContainer.chessBoardCellColor(cell1, cell2);

        Assert.assertTrue("result for " + cell1 + " and cell2 " + cell2 + " should be " + pass,result == pass);

    }

    @Test
    public void test10() {
        String cell1 = "A2";
        String cell2 = "A5";
        Boolean pass = false;

        Boolean result = chessBoardCellColorContainer.chessBoardCellColor(cell1, cell2);

        Assert.assertTrue("result for " + cell1 + " and cell2 " + cell2 + " should be " + pass,result == pass);

    }

}
