package com.company;
import java.awt.*;

public class Circle extends Figure {

    private int d;

    // inX and inY are coordinates, inDiam is the diameter of the circle
    public Circle(int inX, int inY, int inDiam) {
        super(inX, inY);
        d = inDiam;
    }

    // method to draw circle
    public void draw(Graphics g){
        g.drawOval(x,y,d,d);
    }
}
