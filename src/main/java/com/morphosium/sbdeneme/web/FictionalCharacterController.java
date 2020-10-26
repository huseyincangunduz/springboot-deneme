package com.morphosium.sbdeneme.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FictionalCharacterController {

  @RequestMapping("/wa")
  @ResponseBody
  public String welcome() {
    return "Welcome to application";
  }
}
