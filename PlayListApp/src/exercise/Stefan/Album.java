package exercise.Stefan;

import java.util.ArrayList;

class Album {

    private String name;
    private SongList songList;

    Album(String name) {
        this.name = name;
        this.songList = new SongList();
    }

    void addSongToAlbum(String songTitle, int duration) {
        if (songList.addSong(new Song(songTitle, duration)))
            System.out.println("Song " + songTitle + " was added to album " + name);
        else
            System.out.println("Song " + songTitle + " is already in the album " + name);
    }

    boolean findSong(String songTitle) {
        return songList.findSong(songTitle);
    }


    static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        boolean addSong(Song song) {
            if (songs.contains(song))
                return false;
            else
                songs.add(song);
            return true;
        }

            boolean findSong(String songTitle) {
            for (Song song : songs)
                if (song.getTitle().equals(songTitle))
                    return true;
                return false;
        }
    }
}
