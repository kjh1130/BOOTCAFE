package com.kjh1130.board.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j //annotation that make logging easier
public class IndexController {

    @GetMapping("/")
    public String index() {
        log.info("index method call");
        return "index";
    }
}
