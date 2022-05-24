package org.example;

import org.springframework.stereotype.Component;

@Component("rockBean")
public class RockMusic implements Music{
    @Override
    public String getSong(){
        return "Rasputin";
    }
}
