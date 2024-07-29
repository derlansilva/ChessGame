package com.example.classes;

import com.example.controller.Board;

public class Pawn extends Piece{

    public Pawn(boolean isWhite){
        super(isWhite);
    }
    @Override
    public boolean isValidMove(Board board, int startX, int startY, int endX, int endY) {
        
        return false;
    }
}
