package com.gen_z.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/test")
public class TestControler {
    @GetMapping
    public String test() {
        return "Selamat Datang di Testing docker saya";
    }
}
