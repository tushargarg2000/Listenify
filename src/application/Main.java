package application;

import application.Album;
import application.Song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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


        printMenu();

        startSongs(playList);

    }


    public static void startSongs(List<Song> playlist){

        int index = 0;

        System.out.println("Now playing "+playlist.get(index).toString());

        Scanner sc = new Scanner(System.in);

        boolean continuePlayList = true;

        while(continuePlayList){

            System.out.println("Enter your choice!! ");
            int choice = sc.nextInt();

            switch (choice)  {

                case 1 :
                    if(index==(playlist.size()-1)){
                        index++;
                    }else{
                        index = 0;
                    }
                    System.out.println("Now playing "+playlist.get(index).toString());
                    break;
                case 2 :
                    if(index==0)
                        index = 0;
                    else
                        index--;
                    System.out.println("Now playing "+playlist.get(index).toString());
                    break;
                case 3:
                    System.out.println("Now playing "+playlist.get(index).toString());
                    break;
                case 4 :
                    printPlayList(playlist);
                    break;
                case 5 :
                    printMenu();
                    break;
                case 6 :
                    playlist.remove(index);
                    //It will goto the next Index
                    if(index==playlist.size()){
                        index = 0;
                    }
                    break;
                case 7 :
                    Collections.shuffle(playlist);
                    break;
                case 8 :
                    continuePlayList = false;
                    break;


            }

        }




    }

    public static void printPlayList(List<Song> playList){

        for(Song song : playList){
            System.out.println(song.toString());
        }
    }



    public static void printMenu(){

        System.out.println("These are the options you can choose from ");
        System.out.println("1. Goto and play next Song");
        System.out.println("2. Goto the previous Song");
        System.out.println("3. Repeat the same Song");
        System.out.println("4. Show all songs of playList");
        System.out.println("5. Print the Menu");
        System.out.println("6. Delete the current song");
        System.out.println("7. Shuffle the playList");
        System.out.println("8. Exit the playList");


    }
}