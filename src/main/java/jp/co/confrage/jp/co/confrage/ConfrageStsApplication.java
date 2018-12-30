package jp.co.confrage.jp.co.confrage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ConfrageStsApplication {

  @RequestMapping("/")
  String root(){
    return "Hello World!";
  }
  
  @RequestMapping("/home")
  String home(){
    return "Hello World!";
  }

  public static void main(String[] args) {
    SpringApplication.run(ConfrageStsApplication.class, args);
  }
}
