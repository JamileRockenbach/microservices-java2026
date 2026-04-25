package br.edu.atitus.greetingservice.controllers;

import br.edu.atitus.greetingservice.config.GreetingConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

//    @Value("${greeting-service.greeting}")
//    private String greeting;
//
//    @Value("${greeting-service.default-name}")
//    private String defaultName;

    private final GreetingConfig config;

    public GreetingController(GreetingConfig config) {
        this.config = config;
    }

    @GetMapping({"", "/"})
    public String getGreeting(@RequestParam(required = false) String name) {
        return processGreeting(name);
    }
    @GetMapping({"/{name}"})
    public String getGreetingPath(@PathVariable String name) {
        return processGreeting(name);
    }

    @PostMapping
    public String postGreeting(@RequestBody NameRequest request){
        return processGreeting(request.getName());
    }

    private String processGreeting(String name){
        if (name == null || name.isEmpty()){
            name = config.getDefaultName();
        }
        return String.format("%s %s!!!", config.getGreeting(),name);
    }
}