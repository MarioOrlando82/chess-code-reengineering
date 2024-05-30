package pieces;

import chess.*;
import main.*;

public class Rook extends Piece
{
    public Rook(Color color)
    {
        super(color);
    }

    public boolean isValidMove(Position from, Position to)
    {
    	return from.getRow() == to.getRow() || from.getColumn() == to.getColumn();
    }
    
    @Override
    public String toString()
    {
        return "r";
    }
}
