package com.mac.spriteterminal;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

/**
 * Project: Sprite Terminal
 * PC
 * Created by Matt on 02/09/2017 at 12:35 PM.
 */
public class Panel extends JPanel{

    @Getter private final int widthInTiles, heightInTiles;
    @Getter private final int windowScale, tileSize;
    
    @Getter @Setter private Color clearColor = Color.BLACK;
    
    private BufferedImage image;
    private int[] pixels;
    
    public Panel(int widthInTiles, int heightInTiles, int windowScale, int tileSize){
        if(widthInTiles < 1) throw new IllegalArgumentException("Panel width in tiles must be greater than 0.");
        if(heightInTiles < 1) throw new IllegalArgumentException("Panel height in tiles must be greater than 0.");
        if(windowScale < 1) throw new IllegalArgumentException("Panel scale must be greater than 0.");
        if(tileSize < 1) throw new IllegalArgumentException("Tile size must be greater than 0.");
        
        this.widthInTiles = widthInTiles;
        this.heightInTiles = heightInTiles;
        this.windowScale = windowScale;
        this.tileSize = tileSize;
        this.image = new BufferedImage(getWidthInPixels(), getHeightInPixels(), BufferedImage.TYPE_INT_RGB);
        this.pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
        this.setPreferredSize(new Dimension(getWidthInPixels() * windowScale, getHeightInPixels() * windowScale));
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(clearColor);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(image, (getWidth() - getWidthInPixels() * windowScale) / 2,
                           (getHeight() - getHeightInPixels() * windowScale) / 2,
                            getWidthInPixels() * windowScale,
                            getHeightInPixels() * windowScale, null);
    }

    public int getWidthInPixels(){
        return widthInTiles * tileSize;
    }

    public int getHeightInPixels(){
        return heightInTiles * tileSize;
    }
}
