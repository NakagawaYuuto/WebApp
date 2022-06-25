package com.raiseech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String start() {
        return "HelloWorld";
    }

    @GetMapping("/japanese")
    public String greeting() {
        return "おはようございます";
    }

    @GetMapping("/britain")
    public String britain() {
        return "Cheers";
    }

    @GetMapping("/time")
    public String time() {
        LocalDateTime nowDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String dateTimeJp = format.format(nowDateTime);
        return dateTimeJp;
    }

}
