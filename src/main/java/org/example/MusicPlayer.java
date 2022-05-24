package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private Music music;

    public MusicPlayer() {
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(Music music){
        System.out.println(music.getSong());
    }

    public void doMyInit(){
        System.out.println("Создал плеер");
    }

    public void doMyDestroy(){
        System.out.println("Death...");
    }
}
