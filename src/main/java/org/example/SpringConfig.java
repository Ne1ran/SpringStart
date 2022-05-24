package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
@ComponentScan("org.example")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        ArrayList<Music> list = new ArrayList<>();
        list.add(classicalMusic());
        list.add(rockMusic());
        list.add(jazzMusic());
        return new MusicPlayer(list);
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

}
