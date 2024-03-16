/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musiccollectionmanager;

/**
 *
 * @author chris
 */
public class Song {
    private String title;
    private String genre;

    public Song(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    // toString method for displaying song information
    @Override
    public String toString() {
        return title + " (" + genre + ")";
    }
}

