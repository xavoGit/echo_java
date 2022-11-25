package com.xavo.echo.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EchoApplication {

  @RequestMapping("/")
  public String home() throws UnknownHostException {
    return "Hello Docker World: v2.0" + InetAddress.getLocalHost() +"\ns";
  }

//  public static void main(String[] args) {
//    SpringApplication.run(EchoApplication.class, args);
//  }

}