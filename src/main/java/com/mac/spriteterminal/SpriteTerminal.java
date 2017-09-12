package com.mac.spriteterminal;

import com.mac.spriteterminal.graphics.Font;
import com.mac.spriteterminal.graphics.Spritesheet;
import com.sun.istack.internal.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: Sprite Terminal
 * PC
 * Created by Matt on 02/09/2017 at 12:07 PM.
 */
public class SpriteTerminal {
    
    private final int widthInTiles;
    private final int heightInTiles;
    private final int windowScale;
    
    private final String title;
    
    private Spritesheet spritesheet; 
    private Map<String, Font> fonts;
    
    private Terminal terminal;
    
    public SpriteTerminal(int widthInTiles, int heightInTiles, int windowScale, String title, String spritesheet){
        this.widthInTiles = widthInTiles;
        this.heightInTiles = heightInTiles;
        this.windowScale = windowScale;
        this.title = title;
        
//        this.spritesheet = loadSpritesheet(spritesheet);
        this.fonts = new HashMap<String, Font>();
        
        Loader.loadSpritesheet("minirogue-all");
        
        this.terminal = new Terminal(widthInTiles, heightInTiles, windowScale, 8, title);
    }
    

}
