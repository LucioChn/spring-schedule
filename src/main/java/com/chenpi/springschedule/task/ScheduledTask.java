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
public class ScheduledTask {

  private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask.class);

  // 每5秒执行一次
  @Scheduled(cron = "0/5 * * * * ? ")
  // @Scheduled(cron = "${cron.exp}")
  public void test() {
    LOGGER.info(">>>>> ScheduledTask doing ...");
  }
}