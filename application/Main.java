package application;
import BoardGame.Position;
import chess.ChessMatch;
public class Main {
    public static void main(String[] args) {
        ChessMatch  chessmatch = new ChessMatch();
        UI.printBoard(chessmatch.getPieces());
    }
}