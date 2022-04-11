package com.chenpi.springschedule.controller;

import com.chenpi.springschedule.task.DynamicScheduledTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈皮
 * @version 1.0
 * @description
 * @date 2021/3/2
 */
@RestController
@RequestMapping("demo")
public class DemoController {

  private final DynamicScheduledTask dynamicScheduledTask;

  public DemoController(final DynamicScheduledTask dynamicScheduledTask) {
    this.dynamicScheduledTask = dynamicScheduledTask;
  }

  @GetMapping("startDynamicScheduledTask")
  public String startDynamicScheduledTask() {
    dynamicScheduledTask.startTask();
    return "ok";
  }

  @GetMapping("endDynamicScheduledTask")
  public String endDynamicScheduledTask() {
    dynamicScheduledTask.endTask();
    return "ok";
  }

  @GetMapping("changeDynamicScheduledTask")
  public String changeDynamicScheduledTask() {
    dynamicScheduledTask.changeTask();
    return "ok";
  }
}