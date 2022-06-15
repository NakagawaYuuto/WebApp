package com.raiseech.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "こんにちは！　いい天気ですね！";
    }

    //現在日時情報を指定フォーマットの文字列で取得
    LocalDateTime nowDatetime = LocalDateTime.now();
    DateTimeFormatter java8Format = DateTimeFormatter.ofPattern("yyyy/mm/dd");

//    日時情報を指定のフォーマットの文字列で取得


}
