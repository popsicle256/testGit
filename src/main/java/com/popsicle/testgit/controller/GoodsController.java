package com.popsicle.testgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: testGit
 * @description: TODO
 * @author: Popsicle
 * @create: 2021-11-13 15:31
 **/
@Controller
public class GoodsController {

    @GetMapping("/getGoods")
    public String getGoods(){
        return "get";
    }
}
