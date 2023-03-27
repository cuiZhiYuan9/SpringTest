package com.cui.impl;

import com.cui.api.Animal;
import org.springframework.stereotype.Component;

@Component
public class Mouse implements Animal {

    @Override
    public void eat() {
        System.out.println("老鼠吃大米");
    }

    @Override
    public void name() {
        System.out.println("这"+Animal.ani+"老鼠");
    }
    public void action(){
        System.out.println("老鼠喜欢晚上行动");
    }



}
