package chess;

import BoardGame.Position;

public class ChessPosition {

    private char collumn;
    
    private int row;

    public char getCollumn() {
        return collumn;
    }

    


    public int getRow() {
        return row;
    }


    
    public ChessPosition(char collumn, int row){
        if(collumn<'a' || collumn>'h' || row<1 || row>8){
            throw new ChessException("error instaciating positions");
        }
        this.collumn = collumn;
        this.row = row;
    }

    protected Position ToPosition(){
        return new Position(8- row,collumn-'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return  new ChessPosition((char)('a' - position.getColumn()),8 - position.getRow());
    }

    @Override
    public String toString(){
        return "" + collumn + row;
    }
}
