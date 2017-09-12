package com.mac.spriteterminal;

import com.mac.spriteterminal.graphics.Spritesheet;
import lombok.Data;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;


/**
 * Project: Sprite Terminal
 * PC
 * Created by Matt on 02/09/2017 at 12:55 PM.
 */
public class Loader {
    
    public static Spritesheet loadSpritesheet(String name){

        try {
            SpritesheetInfo info = loadSpritesheetInfo(name);
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    private static SpritesheetInfo loadSpritesheetInfo(String fileName) throws IOException, ParseException {
        InputStream in = Loader.class.getClassLoader().getResourceAsStream(fileName + ".json");
        
        JSONObject obj = (JSONObject) new JSONParser().parse(new BufferedReader(new InputStreamReader(in)));
        String name = (String) obj.get("name");
        int width = Integer.parseInt((String) obj.get("width"));
        int height = Integer.parseInt((String) obj.get("height"));
        int tileSize = Integer.parseInt((String) obj.get("tile_size"));
        
        return null;
    }
}

@Data class SpritesheetInfo{
    private String name;
    private int width, height;
    private int tileSize;
}
