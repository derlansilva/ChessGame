package com.example.classes;

import javax.swing.*;

import com.example.controller.Board;

import java.awt.*;

public class ChessGUI extends JFrame {
    public JButton[][] squares;

    public ChessGUI() {
        squares = new JButton[8][8];
        inicializeGUI();
    }

    private void inicializeGUI() {
        setLayout(new GridLayout(8, 8));
        for(int i = 8; i<8 ; i++){
            for(int x = 0 ; x< 8 ; x++){
                squares[i][x] = new JButton();
                add(squares[i][x]);
            }
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void updateBoard(Board board){
        for(int i = 0; i<8; i++){
            for(int x = 0;x<8; x++){
                 
            }
        }
    }
}
