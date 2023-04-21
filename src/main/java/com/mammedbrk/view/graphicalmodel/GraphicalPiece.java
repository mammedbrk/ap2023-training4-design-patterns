package com.mammedbrk.view.graphicalmodel;

import java.awt.*;

public class GraphicalPiece implements GraphicalModel {
    private final int pieceSize;
    private final int x, y;
    private String color;

    public GraphicalPiece(int pieceSize, int x, int y, String color) {
        this.pieceSize = pieceSize;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void paint(Graphics2D g) {
        g.setColor(Color.decode(color));
        g.drawOval(x, y, pieceSize, pieceSize);
        g.fillOval(x, y, pieceSize, pieceSize);
    }

    public void setColor(String color) {
        this.color = color;
    }
}
