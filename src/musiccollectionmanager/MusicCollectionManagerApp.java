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
    
    // LinkedLists for managing song titles
    private LinkedList<String> likedSongs = new LinkedList<>();
    private LinkedList<String> jazzSongs = new LinkedList<>();
    private LinkedList<String> synthSongs = new LinkedList<>();
    
    // Constructor
    public MusicCollectionManagerApp() {
        // Possibly initialize your lists with data or any other setup needed
    }
    
    public int searchSongInLiked(String songTitle) {
        return likedSongs.indexOf(songTitle);
    }

    
    // Method to add a song to the liked songs list
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
    
    // Additional methods to interact with the jazz and synth songs lists
    
    // Method to copy a song to a genre-specific list
    public void copySongToGenre(String songTitle, String genre) {
        // This method assumes that the song already exists in the liked songs list
        if(genre.equalsIgnoreCase("jazz") && !jazzSongs.contains(songTitle)) {
            jazzSongs.add(songTitle);
        } else if(genre.equalsIgnoreCase("synth") && !synthSongs.contains(songTitle)) {
            synthSongs.add(songTitle);
        } else {
            // If the genre is not recognized or the song is already in the genre list
            JOptionPane.showMessageDialog(null, "Genre not recognized or song already in genre list.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Method to remove a song from the liked songs list
    public void removeSongFromLiked(String songTitle) {
        if (likedSongs.contains(songTitle)) {
            likedSongs.remove(songTitle);
            JOptionPane.showMessageDialog(null, "Song removed from Liked Songs.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Song not found in Liked Songs.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Getters to access the song lists from the GUI
    public LinkedList<String> getLikedSongs() {
        return likedSongs;
    }
    
    public LinkedList<String> getJazzSongs() {
        return jazzSongs;
    }
    
    public LinkedList<String> getSynthSongs() {
        return synthSongs;
    }
    
    

    
    
    // Main method to launch the application
    public static void main(String[] args) {
        MusicCollectionManagerGUI myGUI = new MusicCollectionManagerGUI(new MusicCollectionManagerApp());
        myGUI.setVisible(true);
    }
}
