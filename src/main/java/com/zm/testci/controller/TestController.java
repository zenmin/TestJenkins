package com.zm.testci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describle This File Is
 * @Author ZengMin
 * @Date 2018/10/27 10:34
 * @Company Matt
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String helloFunction() {
        return "Hello Jenkins";
    }
}
