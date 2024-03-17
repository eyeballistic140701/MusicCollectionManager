/**
 *
 * @author chris
 */
package musiccollectionmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class MusicCollectionManagerApp {
    
    private ArrayList<String> likedSongs = new ArrayList<>();
    private ArrayList<String> jazzSongs = new ArrayList<>();
    private ArrayList<String> synthSongs = new ArrayList<>();
    private int currentSongIndex = 0; // Index of the currently playing song
    private Timer playTimer; // Timer to handle playing songs
    
    private MusicCollectionManagerGUI gui;
    
    // Constructor
    public MusicCollectionManagerApp() {
        likedSongs = new ArrayList<>();
        jazzSongs = new ArrayList<>();
        synthSongs = new ArrayList<>();

        // Initialize the playTimer with a 3-second delay and an ActionListener
        playTimer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentSongIndex < likedSongs.size()) {
                    // "Play" the song by showing a dialog
                    JOptionPane.showMessageDialog(null, "Now playing: " + likedSongs.get(currentSongIndex));
                    currentSongIndex++; // Move to the next song
                } else {
                    // If repeat mode is on, reset to the first song
                    currentSongIndex = 0;
                }
            }
        });
    }

    public void startPlaying() {
        playTimer.start(); // Start the playTimer to play songs
    }

    public void stopPlaying() {
        playTimer.stop(); // Stop the playTimer
    }

    public void toggleRepeatMode() {
        // If we reach the end of the list and repeat mode is on, start from the beginning
        if (currentSongIndex >= likedSongs.size()) {
            currentSongIndex = 0;
        }
        // Continue or stop the timer based on repeat mode
        if (playTimer.isRunning()) {
            stopPlaying();
        } else {
            startPlaying();
        }
    }
    
    public int searchSongInLiked(String songTitle) {
        // Search for the song in the liked songs list
        return likedSongs.indexOf(songTitle);
    }

    public boolean addSongToLiked(String songTitle) {
        // Add a song to the liked songs list
        if (songTitle == null || songTitle.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a song title.", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (likedSongs.contains(songTitle)) {
            JOptionPane.showMessageDialog(null, "This song is already in your Liked Songs list.", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        likedSongs.add(songTitle);   
        System.out.println("Liked Songs List: " + likedSongs);
        System.out.println("Liked Songs Count: " + likedSongs.size());
        return true;
    }
    
   

    
    public boolean copySongToGenre(String songTitle, String newGenre) {
        // First, check if the song is already in the likedSongs list
        if (!likedSongs.contains(songTitle)) {
            JOptionPane.showMessageDialog(null, "Song is not in the Liked Songs list.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Remove the song from any genre list it may already be in
        if (jazzSongs.remove(songTitle) || synthSongs.remove(songTitle)) {
            // If the song was in a genre list, update the counters

        }

        // Add the song to the new genre list
        if (newGenre.equalsIgnoreCase("jazz")) {
            if (!jazzSongs.contains(songTitle)) {
                jazzSongs.add(songTitle);
                JOptionPane.showMessageDialog(null, "Song added to Jazz", "Success", JOptionPane.INFORMATION_MESSAGE);

                return true;
            }
        } else if (newGenre.equalsIgnoreCase("synth")) {
            if (!synthSongs.contains(songTitle)) {
                synthSongs.add(songTitle);
                JOptionPane.showMessageDialog(null, "Song added to Synth", "Success", JOptionPane.INFORMATION_MESSAGE);

                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Genre not recognized: " + newGenre, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public void removeSongFromLiked(String songTitle) {
        likedSongs.remove(songTitle); // Removing a song from likedSongs list
        // Remove a song from the liked songs list
        if (likedSongs.remove(songTitle)) {
            JOptionPane.showMessageDialog(null, "Song removed from Liked Songs.", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Update the counter for the liked songs list

            // Also remove from genre lists and update those counters if necessary
            removeSongFromGenres(songTitle);
        } else {
            JOptionPane.showMessageDialog(null, "Song not found in Liked Songs.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void removeSongFromGenres(String songTitle) {
        // Remove a song from both genre lists
        jazzSongs.remove(songTitle);
        synthSongs.remove(songTitle);
    }
    
    public ArrayList<String> getLikedSongs() {
        return likedSongs;
    }

    public ArrayList<String> getJazzSongs() {
        return jazzSongs;
    }

    public ArrayList<String> getSynthSongs() {
        return synthSongs;
    }

   
    // Main method to launch the GUI
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MusicCollectionManagerApp app = new MusicCollectionManagerApp();
                MusicCollectionManagerGUI myGUI = new MusicCollectionManagerGUI(app);
                myGUI.setVisible(true);
            }
        });
    }

}

