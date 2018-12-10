package com.project.junglebed;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.SneakyThrows;

@RestController
public class JunglebedController {

    @GetMapping("/")
    public String index(){
        return "Welcome JungleBed API";
    }

    @SneakyThrows
    @GetMapping("/authen")
    public String authen(@RequestParam(defaultValue = "") String username , @RequestParam(defaultValue = "") String password){
        System.out.println(BCrypt.checkpw(password, BCrypt.gensalt()));
        return username + " , " + password;
    }
}
