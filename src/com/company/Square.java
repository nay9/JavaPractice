package com.company;
import java.awt.*;

 class Square extends Figure {

    private int side;

    //inX and inY are coordinates, inSide is the length of the square
    public Square(int inX, int inY, int inSide) {
        super(inX,inY);
        side = inSide;
    }

    // drawing method for the square
    public void draw(Graphics g) {
        g.drawRect(x, y, side, side);
    }

}
