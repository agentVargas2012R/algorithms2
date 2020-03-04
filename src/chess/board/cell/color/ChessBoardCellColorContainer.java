package chess.board.cell.color;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two cells on the standard chess board, determine whether they have the same color or not.
 */
public class ChessBoardCellColorContainer {

    public boolean chessBoardCellColor(String cell1, String cell2) {
        Map<String, String> board = createChessBoard();
        return (board.get(cell1) == board.get(cell2));
    }


    private Map<String, String> createChessBoard() {
        Map<String, String> chessboard = new HashMap<String, String>();
        int useDarkColor = 0;
        for(int i = 7; i >= 0; i--){

            if(i < 7 && ((i % 2) == 0)){
                    useDarkColor = 1;
            }else if(i < 6 && ((i % 2) != 0)){
                    useDarkColor = 0;
            }

            for(char j = 'A'; j <= 'H'; j++){
                String key = j + "" + (i + 1);
                switch(useDarkColor) {
                    case 0:
                        chessboard.put(key, "dark");
                        useDarkColor = 1;
                        break;
                    case 1:
                        chessboard.put(key, "light");
                        useDarkColor = 0;
                        break;
                }
            }
        }
        return chessboard;
    }
}
