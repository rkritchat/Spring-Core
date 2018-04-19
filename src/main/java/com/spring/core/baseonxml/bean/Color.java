package com.spring.core.baseonxml.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Color {
    private Red red;

    @Autowired
    public void setRed(Red red){
        this.red = red;
    }

    public void showColor(){
        red.show();
    }
}
