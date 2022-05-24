package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music tb = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer();
        Music music = context.getBean("classicBean", Music.class);
        musicPlayer.playMusic(music);
        context.close();
    }
}
