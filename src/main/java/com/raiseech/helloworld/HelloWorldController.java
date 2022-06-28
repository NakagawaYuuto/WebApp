package com.raiseech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldController {


    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "HelloWorld") String name) {
        return String.format("おはよう御座います %s", name);
    }


//    @GetMapping
//    public String greeting() {
//        return "おはようございます";
//    }
//
//    @GetMapping
//    public String britain() {
//        return "Cheers";
//    }
//
//    @GetMapping("/time")
//    public String time() {
//        LocalDateTime nowDateTime = LocalDateTime.now();
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
//        String dateTimeJp = format.format(nowDateTime);
//        return dateTimeJp;
//    }

//    @GetMapping("/greetings")
//    public String greetings(@RequestParam(name = "country", defaultValue = "aaaaa") String id) {
//        return "おはようございます";
//    }

//
//    @GetMapping("/hello")
//    String index(
//            @RequestParam(name = "name", value = "name", defaultValue = "no name", required = false) String name,
//            @RequestParam(name = "id") String id) {
//        return "ID:" + id + "NAME" + name;
//    }


}
