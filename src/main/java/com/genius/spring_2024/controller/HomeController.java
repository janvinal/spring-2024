package com.genius.spring_2024.controller;

import com.genius.spring_2024.vo.UserVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {

    @GetMapping("")
    public String home(@RequestParam(value = "id", required = false) Integer id) {
        return String.format("hello, %d", id);
    }

    @GetMapping("v2")
    public UserVo homeV2(UserVo userVo) {
//        userVo
        return userVo;
    }

}
