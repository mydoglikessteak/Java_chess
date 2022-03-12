package application;
import BoardGame.Position;
import chess.ChessMatch;
public class main {

    public static void main(String[] args) {

        ChessMatch  chessmatch = new ChessMatch();
        UI.printBoard(chessmatch.getPieces());


    }

    
    
}
