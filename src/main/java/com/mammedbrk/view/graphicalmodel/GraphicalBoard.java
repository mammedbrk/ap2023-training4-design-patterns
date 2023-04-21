package com.mammedbrk.view.graphicalmodel;

import com.mammedbrk.config.Config;

import java.awt.*;
import java.util.List;
import java.util.Properties;

public class GraphicalBoard implements GraphicalModel {
    private final int width, height;
    private final int rowCount, colCount;
    private final List<GraphicalPiece> pieces;

    public GraphicalBoard(int width, int height, int rowCount, int colCount, List<GraphicalPiece> pieces) {
        this.width = width;
        this.height = height;
        this.rowCount = rowCount;
        this.colCount = colCount;
        this.pieces = pieces;
    }

    public void addPiece(GraphicalPiece piece) {
        pieces.add(piece);
    }

    @Override
    public void paint(Graphics2D g) {
        g.setColor(Color.WHITE);
        for (int i = 0; i <= rowCount; i++) {
            g.drawLine(0, i * height / rowCount, width, i * height / rowCount);
            g.drawLine(i * width / colCount, 0, i * width / rowCount, height);
        }
        for (GraphicalPiece piece: pieces) {
            piece.paint(g);
        }
    }
}
