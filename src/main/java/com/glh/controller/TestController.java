package com.glh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: gonglihao
 * Created by master on 2019/10/21.
 */
@RestController
public class TestController {


    @RequestMapping("test")
    public String Test(){
        return "hello word";
    }




}
