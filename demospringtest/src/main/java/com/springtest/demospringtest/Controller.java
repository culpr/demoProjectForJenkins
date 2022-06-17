package com.springtest.demospringtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class Controller {


    @GetMapping("/hey")
    public String getMethodName() {
        return "Hello from the VSCode!!";
    }

    @GetMapping("/")
    public String getHello() {
        return "Hello World!!";
    }



    // does not work need to figure out how to return a list 
    @GetMapping("/list")
    public List<String> getlistName() {

        List<String>name = new ArrayList<>();


        name.add("Ray Culp");
        name.add("Darlene Lopez");

        return name;
    }


    
    
}
