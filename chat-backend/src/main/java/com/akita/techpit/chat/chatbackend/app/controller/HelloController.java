package com.akita.techpit.chat.chatbackend.app.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.akita.techpit.chat.chatbackend.domain.hello.model.Hello;

@RestController
@RequestMapping()
public class HelloController {

    // @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    // 引数を追加
    public Hello hello(@RequestParam("name") Optional<String> name) {
    // public String hello() {
        // 引数未指定時は「world」とする。
        String resName = name.orElse(" world!");
        // 引数の値または「world」を
        return new Hello("Hello," + resName);
    //     return "Hello, World";
    }
}
