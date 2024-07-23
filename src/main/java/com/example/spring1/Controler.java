package com.example.spring1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Controler {

    @GetMapping("/hey")
    public String message1(){
        return "Hello World";
    }
    @GetMapping("/name")
    public String endpoint(){
        return "Omar Alshehri";
    }
    @GetMapping("/age")
    public String endpoint2(){
        return "one day i was 18 years old ";
    }
    @GetMapping("/status")
    public String endpoint3(){
        return "I am also OK";
    }
    @GetMapping("/health")
    public String endpoint4(){
        return "Server health is up and running";
    }
    @GetMapping("/array")
    public ArrayList<String>names(ArrayList<String>names){
        names.add("Omar Alshehri");
        names.add("Mohammed Alzahrani");
        names.add("Hussam Sharmani");
        names.add("Hasan Alzahrani");
        return names;
    }
}
