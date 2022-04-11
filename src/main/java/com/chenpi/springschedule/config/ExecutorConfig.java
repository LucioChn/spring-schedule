package com.chenpi.springschedule.config;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author 陈皮
 * @version 1.0
 * @description 线程池配置
 * @date 2021/3/2
 */
@Configuration
public class ExecutorConfig {

  public static final int CORE_POOL_SIZE = 2;
  public static final int MAX_POOL_SIZE = 8;
  public static final int QUEUE_CAPACITY = 100;

  @Bean("myExecutor")
  public Executor asyncServiceExecutor() {
    ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    // 核心线程数大小
    executor.setCorePoolSize(CORE_POOL_SIZE);
    // 最大线程数大小
    executor.setMaxPoolSize(MAX_POOL_SIZE);
    // 阻塞队列容量
    executor.setQueueCapacity(QUEUE_CAPACITY);
    // 线程名前缀
    executor.setThreadNamePrefix("myTask-");
    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
    executor.initialize();
    return executor;
  }
}
