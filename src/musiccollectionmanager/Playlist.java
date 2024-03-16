/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiccollectionmanager;

/**
 *
 * @author chris
 */
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Manageable {
    private ArrayList<Song> songs;
    private String name;

    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    // Add a song to the playlist
    public void addSong(Song song) {
        songs.add(song);
    }

    // Remove a song from the playlist
    public boolean removeSong(Song song) {
        return songs.remove(song);
    }

    // Get all songs in the playlist
    public List<Song> getSongs() {
        return songs;
    }

    // Get playlist name
    public String getName() {
        return name;
    }

    // Set playlist name
    public void setName(String name) {
        this.name = name;
    }

    // Optional: override toString() for easier debugging
    @Override
    public String toString() {
        return "Playlist: " + name + "\nSongs:\n" + songs.toString();
    }
}
