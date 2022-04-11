package com.chenpi.springschedule.task;

import java.util.Arrays;
import java.util.TimeZone;
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
public class ScheduledTask05 {

  private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask05.class);

  @Scheduled(cron = "0/5 * * * * ?", zone = "Asia/Shanghai")
  @Async("myExecutor")
  public void test() {
    TimeZone defaultTimeZone = TimeZone.getDefault();
    // >>>>> ScheduledTask doing ...Asia/Shanghai  
    LOGGER.info(">>>>> ScheduledTask doing ..." + defaultTimeZone.getID());
    // 打印出可取得的所有时区ID
    String[] availableIDs = TimeZone.getAvailableIDs();
    LOGGER.info(Arrays.toString(availableIDs));
  }
}