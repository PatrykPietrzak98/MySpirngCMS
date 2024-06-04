package pl.pietrzak.simple_cms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class GreetingController {

    @RequestMapping(value = "greet", method = RequestMethod.GET)
    public String greet() {
        return "Hello Spring Boot";
    }
}
