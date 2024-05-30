package pieces;

import chess.*;
import main.*;

public abstract class Rook extends Piece
{
    public Rook(Color color)
    {
        super(color, 'r');
    }

    @Override
    public String toString()
    {
        return "r";
    }
}
