package com.popsicle.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: testGit
 * @description: TODO
 * @author: Popsicle
 * @create: 2021-11-13 15:24
 **/
@Controller
public class UserController {

    @GetMapping("/get")
    public String get(){
        return "eure";
    }

    @GetMapping("/is_empty()")
    public boolean isEmpty(){
        return false;
    }

    public boolean find(){
        return false;
    }
}
