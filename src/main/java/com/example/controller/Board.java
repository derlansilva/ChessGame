package com.example.controller;

import com.example.classes.Piece;

public class Board {
    private Piece[][] piece;

    public Board(){
        piece = new Piece[8][8];
    }

    private void initizalizaBoard(){

    }

    public Piece[][] getPiece() {
        return piece;
    }

    public void setPiece(Piece[][] piece) {
        this.piece = piece;
    }
}
