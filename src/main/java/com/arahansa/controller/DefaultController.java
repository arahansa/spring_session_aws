package com.arahansa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jarvis on 2017. 2. 19..
 */
@Controller
public class DefaultController {

  @GetMapping("/")
  @ResponseBody
  public String index(){
    return "hello world";
  }

}
