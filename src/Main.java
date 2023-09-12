import application.Album;
import application.Song;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Listenify world");

        Album album1 = new Album("New Hindi Song","Arijit Singh");

        album1.addNewSongToAlbum("Tum hi ho",3.5);
        album1.addNewSongToAlbum("What jhumka",4.2);
        album1.addNewSongToAlbum("Kesariya",5.2);
        album1.addNewSongToAlbum("Shayad",6.0);


        Album album2 = new Album("Old Hindi Songs","Kishore Kumar");
        album2.addNewSongToAlbum("neele neele amber prr",5.6);
        album2.addNewSongToAlbum("Mere Mehboob Qayamat",3.4);
        album2.addNewSongToAlbum("ek chatur naar",6.2);
        album2.addNewSongToAlbum("Mere Sapnon Ki Rani",3.4);



        List<Song> songs = new ArrayList<>();
        songs.add(new Song("s1",1.4));
        songs.add(new Song("s2",4.5));


        Album album3 = new Album("new album",songs,"Anurag");



        List<Song> playList = new ArrayList<>();

        album1.addSongToPlayList(1,playList);
        album1.addSongToPlayList(4,playList);
        album2.addSongToPlayList("Mere Mehboob Qayamat",playList);
        album2.addSongToPlayList("neele neele amber prr",playList);

        for(Song song:playList){
            System.out.println(song.toString());
        }



    }
}