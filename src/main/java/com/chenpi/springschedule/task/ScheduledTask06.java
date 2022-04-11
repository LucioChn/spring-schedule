package com.chenpi.springschedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 陈皮
 * @version 1.0
 * @description 定时任务类
 * @date 2021/3/2
 */
@Component
public class ScheduledTask06 {

  private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask06.class);

  @Scheduled(fixedRate = 1000)
  @Async("myExecutor")
  public void test() {
    try {
      // 休眠5秒
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    LOGGER.info(">>>>> ScheduledTask doing ...");
  }

  @Scheduled(fixedRate = 1000)
  @Async("myExecutor")
  public void test01() {
    try {
      // 休眠5秒
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    LOGGER.info(">>>>> ScheduledTask01 doing ...");
  }
}