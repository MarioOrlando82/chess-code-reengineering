package pieces;

import chess.*;
import main.*;

public class Bishop extends Piece
{

    public Bishop(Color color)
    {
        super(color);
    }
    
    @Override
    public boolean isValidMove(Position from, Position to)
    {
        return Math.abs(from.getRow() - to.getRow()) == Math.abs(from.getColumn() - to.getColumn());
    }
    
    @Override
    public String toString()
    {
        return "b";
    }
}
