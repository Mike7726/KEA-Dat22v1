package com.example.myfirstwebsite.controller;


import com.example.myfirstwebsite.service.Calculate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  Calculate calculate = new Calculate();

  @GetMapping("/")
  public String index() {

    return "Hello Dat22v1";
  }

  @GetMapping("/message")
  public String message(@RequestParam String name) {

    // /message?name=NAME via localhost

    return "Hello " + name;
  }


  @GetMapping("/echo")
  public String Echo(@RequestParam String input) {

    return input;
  }

  @GetMapping("/erdetfredag")
  public String fridayCheck() {

    return calculate.isItFriday();
  }
}
