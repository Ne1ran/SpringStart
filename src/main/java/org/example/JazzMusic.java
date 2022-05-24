package org.example;

import org.springframework.stereotype.Component;

@Component("jazzBean")
public class JazzMusic implements Music{
    @Override
    public String getSong() {
        return "Big Iron";
    }
}
