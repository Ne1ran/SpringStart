package org.example;

import org.springframework.stereotype.Component;

@Component("classicBean")
public class ClassicalMusic implements Music{
    @Override
    public String getSong(){
        return "Philichita";
    }
}
