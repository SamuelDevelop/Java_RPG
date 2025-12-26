package com.myjavagame;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;


public class GamePanel extends JPanel{
    final int tamanhoTilePadrao = 16;
    final int escala = 3;

    final int tamanhoTile = tamanhoTilePadrao * escala;
    final int maxColunas = 16;
    final int maxLinhas = 12;

    final int alturaTela = maxLinhas * tamanhoTile;
    final int larguraTela = maxColunas * tamanhoTile;

    public GamePanel(){
        this.setPreferredSize(new Dimension(larguraTela, alturaTela));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }
}
