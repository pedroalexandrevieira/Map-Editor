package org.academiadecodigo.mandalorians.view;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    private static final int STARTING_COL = 0;
    private static final int STARTING_ROW = 0;

    private int col;
    private int row;

    public Cursor() {
        super(STARTING_COL,STARTING_ROW);
        representation.fill();
        representation.setColor(Color.MAGENTA);
        col = STARTING_COL;
        row = STARTING_ROW;
    }
}
