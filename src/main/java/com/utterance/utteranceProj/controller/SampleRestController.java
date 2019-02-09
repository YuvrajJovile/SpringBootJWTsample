package com.utterance.utteranceProj.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class SampleRestController {

    @GetMapping("/hello")
    private String func(){
        return "Hello world";
    }
}
