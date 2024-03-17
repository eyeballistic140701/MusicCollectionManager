/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package musiccollectionmanager;
//
///**
// *
// * @author chris
// */
//public class MusicCollectionManagerApp {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        MusicCollectionManagerGUI myGUI = new MusicCollectionManagerGUI();
//        myGUI.setVisible(true);
//    }
//    
//}

package musiccollectionmanager;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class MusicCollectionManagerApp {
    
    private final LinkedList<String> likedSongs = new LinkedList<>();
    private final LinkedList<String> jazzSongs = new LinkedList<>();
    private final LinkedList<String> synthSongs = new LinkedList<>();
    
    // Constructor
    public MusicCollectionManagerApp() {
    }
    
    public int searchSongInLiked(String songTitle) {
        return likedSongs.indexOf(songTitle);
    }

    public boolean addSongToLiked(String songTitle) {
        if (songTitle == null || songTitle.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a song title.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (likedSongs.contains(songTitle)) {
            JOptionPane.showMessageDialog(null, "This song is already in your Liked Songs list.", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        likedSongs.add(songTitle);
        return true;
    }
    
    public boolean copySongToGenre(String songTitle, String genre) {
        if (genre.equalsIgnoreCase("jazz")) {
            if (!jazzSongs.contains(songTitle)) {
                jazzSongs.add(songTitle);
                synthSongs.remove(songTitle); // Ensure it's not listed under another genre
                return true;
            }
        } else if (genre.equalsIgnoreCase("synth")) {
            if (!synthSongs.contains(songTitle)) {
                synthSongs.add(songTitle);
                jazzSongs.remove(songTitle); // Ensure it's not listed under another genre
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Genre not recognized: " + genre, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    // Method to remove a song from the liked songs list
    public void removeSongFromLiked(String songTitle) {
        if (likedSongs.remove(songTitle)) {
            // Also attempt to remove from any genre-specific list
            jazzSongs.remove(songTitle);
            synthSongs.remove(songTitle);
            JOptionPane.showMessageDialog(null, "Song removed from Liked Songs and genre lists.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Song not found in Liked Songs.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removeSongFromGenres(String songTitle) {
        jazzSongs.remove(songTitle);
        synthSongs.remove(songTitle);
    }
    
    public LinkedList<String> getLikedSongs() {
        return likedSongs;
    }
    
    public LinkedList<String> getJazzSongs() {
        return jazzSongs;
    }
    
    public LinkedList<String> getSynthSongs() {
        return synthSongs;
    }
    
    public static void main(String[] args) {
        MusicCollectionManagerGUI myGUI = new MusicCollectionManagerGUI(new MusicCollectionManagerApp());
        myGUI.setVisible(true);
    }
}
