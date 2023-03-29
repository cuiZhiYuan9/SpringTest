package com.cui.util;

import org.springframework.stereotype.Component;

import java.util.concurrent.Semaphore;
@Component
public class ThreadControl  {
    private Semaphore semaphore1;
    public ThreadControl() {
        semaphore1 = new Semaphore(60,true);
    }

    public Semaphore getSemaphore1() {
        return semaphore1;
    }
}
