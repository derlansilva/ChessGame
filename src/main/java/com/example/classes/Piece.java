package com.example.classes;

import com.example.controller.Board;

public abstract class Piece {
    private boolean isWhite;
    public Piece(boolean isWhite){
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public abstract boolean isValidMove(Board board , int startX , int startY , int endX , int endY);
}
