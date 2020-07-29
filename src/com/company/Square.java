package com.company;
import java.awt.*;

abstract class Square extends Figure {
    private int side;
    public Square(int inX, int inY, int inSide) {
        super(inX,inY);
        side = inSide;
    }

    public void draw(Graphics g) {
        g.drawRect(x, y, side, side);
    }

}
