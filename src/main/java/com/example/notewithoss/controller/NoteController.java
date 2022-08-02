package com.example.notewithoss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wangfangyuan
 * @date : 2022/8/2 18:35
 */

@RestController
@RequestMapping("/note")
public class NoteController {

    @RequestMapping("push")
    public void push(){

    }


    @RequestMapping("pull")
    public void pull(){}


    @RequestMapping("init")
    public void init(){}


    @RequestMapping("origin")
    public void origin(){}
}
