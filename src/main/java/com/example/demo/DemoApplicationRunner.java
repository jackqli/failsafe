package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DemoApplicationRunner implements ApplicationRunner {
  @Autowired
  private Environment env;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("activeProfiles:" + String.join(",", env.getActiveProfiles()));
    System.out.println(String.join(",", args.getSourceArgs()));
  }
}
