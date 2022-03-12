package BoardGame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    protected Board(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];

    }

    public int getRows(){
        return rows;
    }

    public int getColumns(){
        return columns;
    }

    private void setRow(int rows){
        this.rows = rows;
    }

    private void setColumn(int columns){
        this.columns = columns;
    }
    
}
