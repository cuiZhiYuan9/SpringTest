package com.cui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@ComponentScan("com")
//@ImportResource(locations ="classpath:spring.xml")
public class SpringConfig {
    @Bean("TaskExecutor")
    public Executor taskExecutor(){
        ThreadPoolTaskExecutor threadPoolExecutor = new ThreadPoolTaskExecutor();
        threadPoolExecutor.setCorePoolSize(5);//核心线程数
        threadPoolExecutor.setMaxPoolSize(100);//最大线程数
        threadPoolExecutor.setQueueCapacity(1000);//队列长度
        threadPoolExecutor.setKeepAliveSeconds(1000);//线程空闲时间
        threadPoolExecutor.setThreadNamePrefix("task-asyn");
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());//拒绝策略
        return threadPoolExecutor;
    }

}
