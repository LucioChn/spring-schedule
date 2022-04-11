package com.chenpi.springschedule.controller;

import com.chenpi.springschedule.task.ChangeTimeScheduledTask;
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
@RequestMapping("demo01")
public class Demo01Controller {

  private final ChangeTimeScheduledTask changeTimeScheduledTask;

  public Demo01Controller(final ChangeTimeScheduledTask changeTimeScheduledTask) {
    this.changeTimeScheduledTask = changeTimeScheduledTask;
  }

  @GetMapping
  public String testChangeTimeScheduledTask() {
    changeTimeScheduledTask.setExpression("0/10 * * * * *");
    return "ok";
  }
}