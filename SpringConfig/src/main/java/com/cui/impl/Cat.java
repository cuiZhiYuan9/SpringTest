package com.cui.impl;

import com.cui.api.Animal;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal {
    @Override
    public void show() {
        System.out.println("1111我是一只猫");
    }
    public void sleep(){
        System.out.println("我喜欢晚上睡觉");
    }


}
