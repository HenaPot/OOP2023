package org.example.lab8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

class task4 {
    public static void main(String[] args) {
        ArrayList<Song> playlist = new ArrayList<>(Arrays.asList(
                new Song("Song1", "Artist1", "Rock"),
                new Song("Song2", "Artist2", "Pop"),
                new Song("Song3", "Artist3", "Rock"),
                new Song ("Song4", "Artist4", "Hip Hop")
                ));
        GenereFilterIterator iterator = new GenereFilterIterator(playlist, "Rock");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

class Song {
    private String title;
    private String artist;
    private String genre;

    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

class GenereFilterIterator implements Iterator<Song> {
    private ArrayList<Song> playlist;
    private String targetGenre;
    // you always need to provide the currentIndex, because that's the only way to iterate through the array this way
    private int currentIndex;

    public GenereFilterIterator(ArrayList<Song> playlist, String targetGenre) {
        this.playlist = playlist;
        this.targetGenre = targetGenre;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < playlist.size() && ! playlist.get(currentIndex).getGenre().equals(targetGenre)) {
            currentIndex++;
        }
        return currentIndex < playlist.size();
    }

    @Override
    public Song next() {
        if (! hasNext())
            throw new NoSuchElementException();
        return playlist.get(currentIndex++);
    }
}
