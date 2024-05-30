package pieces;

import chess.*;
import main.*;

public class Queen extends Piece
{
    public Queen(Color color)
    {
        super(color);
    }
    
    public boolean isValidMove(Position from, Position to)
    {
    	return Math.abs(from.getRow() - to.getRow()) == Math.abs(from.getColumn() - to.getColumn()) || from.getRow() == to.getRow() || from.getColumn() == to.getColumn();    
    }
    
    @Override
    public String toString()
    {
        return "q";
    }
}
