package musicdata.entity;
// Generated Oct 3, 2013 4:36:56 PM by Hibernate Tools 3.2.1.GA



/**
 * Playlist generated by hbm2java
 */
public class Playlist  implements java.io.Serializable {


     private int id;
     private String name;

    public Playlist() {
    }

	
    public Playlist(int id) {
        this.id = id;
    }
    public Playlist(int id, String name) {
       this.id = id;
       this.name = name;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}

