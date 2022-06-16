package app.src.main.java.com.sample.crud.controller;

import org.springframework.web.bind.annotation.*;

@RestController
class Controller{

  @GetMapping("/")
    public String haello() {
        return "I am a hunter and she want to see my gun";
    }
  
}