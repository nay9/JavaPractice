package com.company;

import java.awt.*;

public class FigureWindow extends Frame {
    private int numOfFigures;
    private Figure[] figures;

    public FigureWindow(int max) {
        super("Fabulus Figures");
        figures = new Figure[max];
        numOfFigures = 0;
    }

    public void addFigure(Figure f) {
        if (numOfFigures < figures.length) {
            figures[numOfFigures] = f;
            numOfFigures++;
        }
    }
}
