package com.example.myfirstwebsite.service;

import java.time.LocalDate;

public class Calculate {

  public String isItFriday() {
    LocalDate date = LocalDate.now();

    if ("FRIDAY".equals(date.getDayOfWeek().toString()))
      return "YES";
    else
      return "NO  it's " + date.getDayOfWeek();
  }

}
