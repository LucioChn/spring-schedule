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
public class ScheduledTask02 {

  private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask02.class);

  @Scheduled(fixedDelayString = "1000")
  public void test() {
    LOGGER.info(">>>>> ScheduledTask doing ...");
    try {
      // 休眠2秒
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}