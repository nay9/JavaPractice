package com.company;

import java.awt.*;

public class FigureWindow extends Frame {

    private int numOfFigures;

    private Figure[] figures;

    //int max is the maximum number of figures
    public FigureWindow(int max) {
        super("Fabulus Figures");
        figures = new Figure[max];
        numOfFigures = 0;
    }

    //adds the figure to the window, only if we haven't reached the max
    public void addFigure(Figure f) {
        if (numOfFigures < figures.length) {
            figures[numOfFigures] = f;
            numOfFigures++;
        }
    }

    //draws the figure
    public void paint(Graphics g) {
        int i;
        for(i = 0; i < numOfFigures; i++) {
            figures[i].draw(g);
        }
    }

    //Main method, creates a FigureWindow and a few figures
    public static void main{String[] args} {
        FigureWindow w = new FigureWindow(10);
        w.setSize(400, 300);
        w.addFigure(new Square(50,50,200));
        w.addFigure(new Circle(200,100,150));
        w.addFigure(new Circle(300,200,200));
        w.show();

    }
}
