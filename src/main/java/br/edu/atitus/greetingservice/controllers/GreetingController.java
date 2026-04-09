package br.edu.atitus.greetingservice.controllers;

import br.edu.atitus.greetingservice.configs.GreetingConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        if (name == null || name.isEmpty()) {
            name = config.getDefaultName();
        }
        return String.format("%s %s!!!", config.getGreeting(), name);
    }

    @GetMapping("/{name}")
    public String getGreetingPath(@PathVariable String name) {
        return String.format("%s %s!!!", config.getGreeting(), name);
    }

    @PostMapping
    public String postGreeting(@RequestBody GreetingRequest request) {
        String name = (request.getName() == null || request.getName().isEmpty())
                ? config.getDefaultName()
                : request.getName();
        return String.format("%s %s!!!", config.getGreeting(), name);
    }
}

class GreetingRequest {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}