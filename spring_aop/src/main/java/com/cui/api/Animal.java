package com.cui.api;

/**
 * 抽象动物类
 * 测试当一个接口由多个实现类实现实现时在调用时如何区分调用的是那个实现类
 * 接口方法默认为抽象方法
 *
 */
public interface Animal {
    //public static final String
    String ani  = "动物";
    //public abstract void eat
    void eat();
    void name();


}
