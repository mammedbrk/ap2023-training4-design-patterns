package com.mammedbrk.model;

import java.util.ArrayList;

public class Board {
    private final int rowCount, colCount;
    private Piece[][] pieces;

    public Board(int rowCount, int colCount) {
        this.rowCount = rowCount;
        this.colCount = colCount;
        pieces = new Piece[rowCount][colCount];
    }

    // methods

    public void addPiece(Piece piece) {
        pieces[piece.getX()][piece.getY()] = piece;
    }

    // getters and setters
    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }
}
