package com.mammedbrk.logic;

import com.mammedbrk.config.Config;
import com.mammedbrk.model.Board;
import com.mammedbrk.model.Piece;

import java.util.Properties;

// singleton
public class BoardBuilder {
    private static BoardBuilder instance;
    private Properties config;

    private BoardBuilder() {
        config = Config.getConfig();
    }

    public static BoardBuilder getInstance() {
        if (instance == null) {
            instance = new BoardBuilder();
        }
        return instance;
    }

    public Board build() {
        int rowCount = Integer.parseInt(config.getProperty("rowCount"));
        int colCount = Integer.parseInt(config.getProperty("colCount"));
        Board board = new Board(rowCount, colCount);
        initPieces(board);
        return board;
    }

    private void initPieces(Board board) {
        for (int i = 1; config.getProperty("xPiece" + i) != null; i++) {
            int x = Integer.parseInt(config.getProperty("xPiece" + i));
            int y = Integer.parseInt(config.getProperty("yPiece" + i));
            int color = Integer.parseInt(config.getProperty("colorPiece" + i));

            Piece piece = new Piece(x, y, color);
            board.addPiece(piece);
        }
    }
}
