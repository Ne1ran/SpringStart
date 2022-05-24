package org.example;

import java.util.ArrayList;
import java.util.Random;

public class MusicPlayer {
    private ArrayList<Music> musicList;

    public MusicPlayer(ArrayList<Music> music) {
        this.musicList = music;
    }

    public void doMyInit(){
        System.out.println("Создал плеер");
    }

    public void doMyDestroy(){
        System.out.println("Death...");
    }

    public String playMusic() {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        String tempString = "";
        return musicList.get(randomInt).getSong();
    }
}
