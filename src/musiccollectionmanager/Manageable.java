/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musiccollectionmanager;
/**
 *
 * @author chris
 */


public interface Manageable {
    boolean addSongToLiked(String songTitle);
    void removeSongFromLiked(String songTitle);
    boolean addSongToGenre(String songTitle, String genre);
    void removeSongFromGenres(String songTitle);
    int searchSongInLiked(String songTitle);
}

