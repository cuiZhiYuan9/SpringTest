package com.cui.impl;

import com.cui.api.Animal;
import org.springframework.stereotype.Component;

@Component
public class dog implements Animal {

    @Override
    public void show() {
        System.out.println("@2222我是一只狗");
    }
}
