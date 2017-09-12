package com.mac.spriteterminal;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Project: Sprite Terminal
 * PC
 * Created by Matt on 02/09/2017 at 03:41 PM.
 */
public class DefaultWindowCloseHandler extends WindowAdapter{
        
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
