/*
 * Timothy Hooks
 */
package titanmusicplayer.bll;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Tim
 */
public class Library {
    
    private ArrayList library;
    
    public Library(){
        this.library = new ArrayList<Song>();
    }
    
    public void addSong(Song song){
        library.add(song);
    }
    
    public void removeSong(Song song){
        library.remove(song);
    }
    
    public void sortTitle(){
        Collections.sort(library, Song.Comparators.byTitle);
    }
 
    public void sortArtist(){
         Collections.sort(library, Song.Comparators.byArtist);
    }
}


