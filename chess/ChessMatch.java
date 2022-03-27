package chess;

import BoardGame.Board;
import BoardGame.Position;
import chess.chess_pieces.*;

public class ChessMatch {

    private Board board;
    
    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){

        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for(int i = 0; i < board.getRows(); i++){

            for(int j = 0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece)board.piece(i,j);

            }
        }
        return mat;
    }

    private void initialSetup(){
        board.PlacePiece(new King(board,color.WHITE),new Position(0,4));

        board.PlacePiece(new King(board,color.BLACK),new Position(7,4));

    }
}
