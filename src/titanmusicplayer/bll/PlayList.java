/*
 * Timothy Hooks
 */
package titanmusicplayer.bll;

import java.util.ArrayList;

/**
 *
 * @author Tim
 */
public class PlayList {
    
    private String name;
    private ArrayList playlist;
    
    public PlayList(String name, ArrayList<MusicPlayer> songs){
        this.name = name;
        playlist.add(songs);
    }
    
}
