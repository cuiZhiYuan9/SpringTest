package com.cui.impl;

import com.cui.api.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cat  {

    public void eat() {
        System.out.println("猫吃老鼠");
    }

    public void name() {
        System.out.println("这"+Animal.ani+"猫");
    }
    public void cal(){
        int i = 1/0;
    }
}
