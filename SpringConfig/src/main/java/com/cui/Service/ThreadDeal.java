package com.cui.Service;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

/*线程池*/
@Service("threadDeal")
public class ThreadDeal {
    @Resource(name = "TaskExecutor")
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;
    public  void dealService(Thread mainthread) {
        BlockingQueue queue = threadPoolTaskExecutor.getThreadPoolExecutor().getQueue();
        int n = Math.min(queue.size() / 10, threadPoolTaskExecutor.getMaxPoolSize());
        while (true) {
            if (n > queue.remainingCapacity()) {
                threadPoolTaskExecutor.submit(mainthread);
                break;
            } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

