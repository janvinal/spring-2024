package com.genius.spring_2024.controller;

import com.genius.spring_2024.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController("/")
public class HomeController {

    @GetMapping("")
    public String home(@RequestParam(value = "id", required = false) Integer id) {
        return String.format("hello, %d", id);
    }

    @GetMapping("v2")
    public UserVo homeV2(UserVo userVo) {
        userVo.setId(1);
        return userVo;
    }

    @PostMapping("v3")
    public UserVo homeV3(@RequestBody UserVo userVo) {
        log.info("homeV3 into... userVo={}", userVo);
        userVo.setId(1);
        return userVo;
    }

}
