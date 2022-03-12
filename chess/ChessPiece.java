package chess;

import BoardGame.Board;
import BoardGame.Piece;

public class ChessPiece extends Piece {
    
    private color color;

    public ChessPiece(color color,Board board) {
        super(board);
        this.color = color;
    }

    public color getcolor() {
        return color;
    }

}
