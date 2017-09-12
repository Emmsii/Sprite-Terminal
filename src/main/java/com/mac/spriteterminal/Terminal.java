package com.mac.spriteterminal;

import lombok.Getter;

import javax.swing.*;

/**
 * Project: Sprite Terminal
 * PC
 * Created by Matt on 02/09/2017 at 12:35 PM.
 */
public class Terminal extends JFrame{
    
    @Getter private final Panel panel;
    
    public Terminal(int widthInTiles, int heightInTiles, int windowScale, int tileSize, String title){
        this(widthInTiles, heightInTiles, windowScale, tileSize, title, null);
    }

    public Terminal(int widthInTiles, int heightInTiles, int windowScale, int tileSize, String title, ImageIcon icon){
        this.panel = new Panel(widthInTiles, heightInTiles, windowScale, tileSize);
        if(title == null) throw new IllegalArgumentException("Terminal title cannot be null.");
        this.setTitle(title.trim());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        if(icon != null) this.setIconImage(icon.getImage());
        this.setVisible(true);
    }
}
