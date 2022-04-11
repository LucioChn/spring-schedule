package com.chenpi.springschedule.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 陈皮
 * @version 1.0
 * @description 定时任务类
 * @date 2021/3/2
 */
@Component
public class ScheduledTask04 {

  private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask04.class);

  @Scheduled(fixedRate = 1000)
  public void test() {
    try {
      // 休眠5秒
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    LOGGER.info(">>>>> ScheduledTask doing ...");
  }
}