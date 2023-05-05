package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    Environment env;

    @Value("${env.msg}")
    String msg;

    @GetMapping("value")
    public String welcomeMsg1(){
        return msg;
    }
    @GetMapping("env")
    public String welcomeMsg2(){
        return env.getProperty("env.msg");
    }

}