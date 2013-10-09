/*
 * Timothy Hooks
 */
package titanmusicplayer.bll;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

/**
 *
 * @author Tim
 */
public class MusicPlayer {
    
    private Player player; 
    
    public void play(Song song) {
        try {
            FileInputStream fis     = new FileInputStream(song.getFile());
            BufferedInputStream bis = new BufferedInputStream(fis);
            player = new Player(bis);
        }
        catch (Exception e) {
            System.out.println("Problem playing file " + song.getFile());
            System.out.println(e);
        }

        new Thread() {
            @Override
            public void run() {
                try { player.play(); }
                catch (Exception e) { System.out.println(e); }
            }
        }.start();
    }
    
    public void stop() { 
        if (player != null) player.close(); 
    }
    
}