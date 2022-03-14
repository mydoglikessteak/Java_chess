package chess.chess_pieces;

import BoardGame.Board;
import chess.ChessPiece;

public class Rook extends ChessPiece {

    public Rook(chess.color color, Board board) {
        super(color, board);
    }
    
    @Override
    public String toString() {
        return "R";
    }
    
}
