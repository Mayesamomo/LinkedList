/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca1;

import java.util.Objects;

/**
 *
 * @author micha
 */
public class Song implements Comparable<Song>{

    private String title;
    private String artist;
    private String genre;
    private String album;
    private int trackNumber;
    private int playCount;
    private int rating;
    private static int countPlayed = 0;

    public Song(String title, String artist, String genre, String album, int trackNumber,int rating) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.album = album;
        this.trackNumber = trackNumber;
        playCount = countPlayed;
         countPlayed++;
        this.rating = rating;
    }

    public Song() {
    }

//getters    

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public String getAlbum() {
        return album;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public int getPlayCount() {
        return playCount;
    }

    public int getRating() {
        return rating;
    }

    public static int getCountPlayed() {
        return countPlayed;
    }
    
    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static void setCountPlayed(int countPlayed) {
        Song.countPlayed = countPlayed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.title);
        hash = 83 * hash + Objects.hashCode(this.artist);
        hash = 83 * hash + Objects.hashCode(this.genre);
        hash = 83 * hash + Objects.hashCode(this.album);
        hash = 83 * hash + this.trackNumber;
        hash = 83 * hash + this.playCount;
        hash = 83 * hash + this.rating;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (this.trackNumber != other.trackNumber) {
            return false;
        }
        if (this.playCount != other.playCount) {
            return false;
        }
        if (this.rating != other.rating) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.artist, other.artist)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        return Objects.equals(this.album, other.album);
    }

    
    //compareTo method compares artist and in ascending order
    @Override
    public int compareTo(Song t) {
        int comp = this.artist.compareTo(t.artist);
        if(comp == 0){
            return this.title.compareTo(t.title);
        }
        return comp;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + ", genre=" + genre + ", album=" + album + ", trackNumber=" + trackNumber + ", playCount=" + playCount + ", rating=" + rating + '}';
    }
    
    
    
    
}
