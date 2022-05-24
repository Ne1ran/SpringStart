package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music tb = context.getBean("musicBean", Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(tb);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
