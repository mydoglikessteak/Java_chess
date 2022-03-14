package chess.chess_pieces;

import BoardGame.Board;
import chess.ChessPiece;

public class King extends ChessPiece{

    public King(Board board, chess.color color) {
        super(color, board);
    }

    @Override
    public String toString(){
        return "K";
    }
    
}
