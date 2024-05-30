package pieces;

import chess.*;
import main.*;

public abstract class Bishop extends Piece
{

    public Bishop(Color color)
    {
        super(color, 'b');
    }

    @Override
    public String toString()
    {
        return "b";
    }
}
