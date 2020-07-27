package exercise.Stefan;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    private static LinkedList<Song> myPlaylist = new LinkedList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        Album album1 = new Album("111");
        Album album2 = new Album("222");
        Album album3 = new Album("333");
        Album album4 = new Album("444");

        album1.addSongToAlbum("1.1", 60);
        album1.addSongToAlbum("1.2", 61);
        album1.addSongToAlbum("1.3", 62);
        album1.addSongToAlbum("1.4", 63);
        album1.addSongToAlbum("1.5", 64);
        album2.addSongToAlbum("2.1", 60);
        album2.addSongToAlbum("2.2", 61);
        album2.addSongToAlbum("2.3", 62);
        album2.addSongToAlbum("2.4", 63);
        album2.addSongToAlbum("2.5", 64);
        album3.addSongToAlbum("3.1", 60);
        album3.addSongToAlbum("3.2", 61);
        album3.addSongToAlbum("3.3", 62);
        album3.addSongToAlbum("3.4", 63);
        album3.addSongToAlbum("3.5", 64);
        album4.addSongToAlbum("4.1", 60);
        album4.addSongToAlbum("4.2", 61);
        album4.addSongToAlbum("4.3", 62);
        album4.addSongToAlbum("4.4", 63);
        album4.addSongToAlbum("4.5", 64);

        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        albums.add(album4);

        addSongToPlaylist("1.1", 60);
        addSongToPlaylist("1.2", 61);
        addSongToPlaylist("1.3", 62);
        addSongToPlaylist("1.4", 63);
        addSongToPlaylist("1.5", 64);
        addSongToPlaylist("2.1", 60);
        addSongToPlaylist("2.2", 61);
        addSongToPlaylist("2.3", 62);
        addSongToPlaylist("2.4", 63);
        addSongToPlaylist("2.5", 64);
        addSongToPlaylist("3.1", 60);
        addSongToPlaylist("3.2", 61);
        addSongToPlaylist("3.3", 62);
        addSongToPlaylist("3.4", 63);
        addSongToPlaylist("3.5", 64);
        addSongToPlaylist("4.1", 60);
        addSongToPlaylist("4.2", 61);
        addSongToPlaylist("4.3", 62);
        addSongToPlaylist("4.4", 63);
        addSongToPlaylist("4.5", 64);
        addSongToPlaylist("5.1", 20);

        boolean quit = false;
        printActions();
        boolean goingForward = true;
        ListIterator<Song> listIterator = myPlaylist.listIterator();
        while (!quit) {
            System.out.print("Your option: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    if(!goingForward && listIterator.hasNext()) {
                        listIterator.next();
                        goingForward = true;
                    }

                    if(listIterator.hasNext()) {
                        System.out.print("The song that is playing is: " + listIterator.next().getTitle() + "===");
                        listIterator.previous();
                        System.out.println("Duration: " + listIterator.next().getDuration());
                    }
                    else
                        System.out.println("You have reached the final song");
                    break;
                case 2:
                    if(goingForward && listIterator.hasPrevious()) {
                        listIterator.previous();
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious()) {
                        System.out.print("The song that is playing is: " + listIterator.previous().getTitle() + "===");
                        listIterator.next();
                        System.out.println("Duration: " + listIterator.previous().getDuration());
                    } else
                        System.out.println("You are at the start of the playlist");
                    break;
                case 3:
                    if (goingForward && listIterator.hasNext()) {
                        listIterator.previous();
                        System.out.print("The song that is playing is: " + listIterator.next().getTitle() + "===");
                        listIterator.previous();
                        System.out.println("Duration: " + listIterator.next().getDuration());
                    }
                    else if (!goingForward && listIterator.hasPrevious()){
                        listIterator.next();
                        System.out.print("The song that is playing is: " + listIterator.previous().getTitle() + "===");
                        listIterator.previous();
                        System.out.println("Duration: " + listIterator.previous().getDuration());
                    }
                    else
                        System.out.println("You have reached the start/final of the playlist");
                    break;
                case 4:
                    System.out.print("Introduce the name of the track you want to remove from the playlist: ");
                    String songTitle = scan.nextLine();
                    removeSong(songTitle);
                    break;
                case 5:
                    listSongs(myPlaylist);
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addSongToPlaylist(String songTitle, int duration) {
        if (checkIfSongIsInAlbum(songTitle)) {
            myPlaylist.add(new Song(songTitle, duration));
            System.out.println("Song " + songTitle + " was added to playlist");
        }
    }

    private static boolean checkIfSongIsInAlbum(String songTitle) {
        for (Album album : albums) {
            if (album.findSong(songTitle))
                return true;
        }
        return false;
    }

    private static void removeSong(String songTitle) {
        ListIterator<Song> i = myPlaylist.listIterator();
        while (i.hasNext())
            if (i.next().getTitle().equals(songTitle)) {
                i.previous();
                System.out.println(i.next().getTitle() + " was removed from the playlist");
                i.previous();
                i.remove();
                return;
            }
        System.out.println("The song you added is not on the playlist");
    }

    private static void listSongs(LinkedList<Song> playlist) {
        ListIterator<Song> i = playlist.listIterator();
        int k=1;
        if (i.hasNext()) {
            System.out.print(k + ". " + i.next().getTitle());
            i.previous();
            System.out.println(". Duration: " + i.next().getDuration());
            k++;
        }
        while (i.hasNext()) {
            System.out.print(k + ". " + i.next().getTitle());
            i.previous();
            System.out.println(". Duration: " + i.next().getDuration());
            k++;
        }
    }

    private static void printActions() {
        System.out.println("Press:\n" +
                "0 - quit\n" +
                "1 - skip forward\n" +
                "2 - skip backward\n" +
                "3 - replay song\n" +
                "4 - remove song\n" +
                "5 - list songs\n" +
                "6 - print actions");
    }
}
