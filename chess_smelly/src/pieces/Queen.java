package pieces;

import chess.*;
import main.*;

public class Queen extends Piece
{
    public Queen(Color color)
    {
        super(color, 'q');
    }

    @Override
    public String toString()
    {
        return "q";
    }
}
