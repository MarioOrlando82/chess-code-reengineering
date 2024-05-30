package pieces;

import chess.*;
import main.*;

public abstract class Piece
{
    private Color _color;
    public Piece(Color color)
    {
        _color = color;
    }

    public Color getColor()
    {
        return _color;
    }

    public abstract boolean isValidMove(Position from, Position to);
}
