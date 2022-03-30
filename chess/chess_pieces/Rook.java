package chess.chess_pieces;

import BoardGame.Board;
import chess.ChessPiece;

public class Rook extends ChessPiece {

    public Rook(Board board, chess.color color) {
        super(color, board);
    }
    
    @Override
    public String toString() {
        return "R";
    }
    
}
