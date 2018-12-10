package com.project.junglebed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JunglebedController {

    @GetMapping("/")
    public String index(){
        return "Welcome JungleBed API";
    }
}
