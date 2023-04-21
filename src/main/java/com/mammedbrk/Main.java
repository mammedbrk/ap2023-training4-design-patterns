package com.mammedbrk;

import com.mammedbrk.logic.BoardBuilder;
import com.mammedbrk.model.Board;
import com.mammedbrk.model.Piece;

public class Main {
    public static void main(String[] args) {
        Board board = BoardBuilder.getInstance().build();
        Piece[][] pieces = board.getPieces();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print((pieces[i][j] == null? 0: pieces[i][j].getColor()) + " ");
            }
            System.out.println();
        }
    }
}
