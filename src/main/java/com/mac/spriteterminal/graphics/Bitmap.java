package com.mac.spriteterminal.graphics;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project: Sprite Terminal
 * PC
 * Created by Matt on 02/09/2017 at 12:11 PM.
 */
@Data @NoArgsConstructor 
public class Bitmap {

    protected String name;
    protected int width, height;
    protected int[] pixels;

    public int pixel(int x, int y){
        if(x < 0 || y < 0 || x >= width || y >= height) return 0;
        return pixels[x + y * width];
    }
}
