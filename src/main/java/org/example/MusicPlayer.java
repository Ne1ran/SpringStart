package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private Integer volume;

    private MusicPlayer() {
    }

    public static MusicPlayer getMusicPlayer(){
        return new MusicPlayer();
    }

    public void setMusicList(List<Music> music) {
        this.musicList = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void playMusic(){
        musicList.stream().map(x -> x.getSong()).forEach(System.out::println);
    }

    public void doMyInit(){
        System.out.println("Создал плеер");
    }

    public void doMyDestroy(){
        System.out.println("Death...");
    }
}
