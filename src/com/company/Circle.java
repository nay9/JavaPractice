package com.company;
import java.awt.*;

public class Circle extends Figure {
    private int d;
    public Circle(int inX, int inY, int inDiam) {
        super(inX, inY);
        d = inDiam;
    }

    public void draw(Graphics g){
        g.drawOval(x,y,d,d);
    }
}
