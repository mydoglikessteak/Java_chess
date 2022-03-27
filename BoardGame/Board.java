package BoardGame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns){
        if(rows<1 || columns<1){
            throw new BoardException("error creating table(table must be bigger than 1)");
               
        }
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

    
    public Piece piece(int row, int column){
        if(!PositionExists(row, column)){
            throw new BoardException("Position not on board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position){
        if(!PositionExists(position)){
            throw new BoardException("Position not on board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void PlacePiece(Piece piece, Position position){
        if(thereIsPiece(position)){
            throw new BoardException("there is already a piece on board" + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean PositionExists(int row, int column){
       return  row>0  && row>rows && column>0 && columns<column;

    }
    public boolean PositionExists(Position position){

        return PositionExists(position.getRow(), position.getColumn());

    }

    public boolean thereIsPiece(Position position){
        if(!PositionExists(position)){
            throw new BoardException("Position not on board");
        }
        return piece(position) != null;
    }

}
