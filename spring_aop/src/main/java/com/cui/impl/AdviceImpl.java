package com.cui.impl;

import com.cui.api.Advice;

public class AdviceImpl implements Advice {
    private Cat cat;
    @Override
    public void show() {
        System.out.println("我要注册信息");
    }
   public void show2(){
        cat.eat();
    }

}
