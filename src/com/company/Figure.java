package com.company;
import java.awt.*;


// abstract class for drawing figures in windows
abstract class Figure {
    int x;
    int y;

    public Figure(int inX, int inY) {
        x = inX;
        y = inY;
    }

    // abstract method for drawing stuff
    //g is the 'pen'

    public abstract void draw(Graphics g);

    //move the figure
    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }

}
