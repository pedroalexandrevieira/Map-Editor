package org.academiadecodigo.mandalorians.view;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;

    private GridCell[][] gridCells;
    private int cols;
    private int rows;

    public Grid(int cols, int rows) {
        gridCells=multipleRectangles(cols,rows);
        this.cols=cols;
        this.rows=rows;
    }

    public GridCell[][] multipleRectangles(int cols, int rows) {
        GridCell[][] rectangles = new GridCell[cols][rows];
        for (int i = 0; i < rectangles.length; i++) {
            for (int j = 0; j < rectangles.length; j++) {
                rectangles[i][j] = new GridCell(j,i);
            }
        }
        return rectangles;
    }

}
