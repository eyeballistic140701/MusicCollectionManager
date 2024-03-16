/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musiccollectionmanager;
import java.util.List;
/**
 *
 * @author chris
 */


public interface Manageable {
    void addSong(Song song);
    boolean removeSong(Song song);
    List<Song> getSongs();
}

