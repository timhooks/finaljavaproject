/*
 * Timothy Hooks
 */
package titanmusicplayer.bll;

import java.util.Comparator;


/**
 *
 * @author Tim
 */
public class Song implements Comparable<Song> {
    
    private static String artist;
    private static String title;
    private static String filename;


    public Song(String artist, String title, String filename) {
        this.artist = artist;
        this.title = title;
        this.filename = filename;
    }   
    
    public String getFile(){
        return this.filename;
    }
    
    public static class Comparators {
        public static Comparator<Song> byTitle = new Comparator<Song>() {
            @Override
            public int compare(Song t, Song t1) {
                return t.title.compareTo(t1.title);
            }
        };
        public static Comparator<Song> byArtist = new Comparator<Song>() {
            @Override
            public int compare(Song t, Song t1) {
             return t.artist.compareTo(t1.artist);
            }
        };
    }
    
    @Override
    public int compareTo(Song song) {
        return Comparators.byTitle.compare(this, song);
    }
}

