package com.example.distributed.lock.controller;

import com.example.distributed.lock.service.StockService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liujb
 * @description
 * @date 2022-09-14 22:13
 */
@Controller
@RestController
@RequiredArgsConstructor
@Slf4j
public class StockController {


    private final StockService stockService;

    @GetMapping("stock/deduct")
    public String deduct() {
        stockService.deduct();
        return "hello stock deduct";
    }

    @PostMapping("test")
    public String test(@RequestBody String body) {
        System.out.println(body);
        log.info("test====>{}",body);
        return body;
    }


    @GetMapping("hello")
    public String helloWorld(@RequestParam(value = "param", required = false) String param) {
        log.info("收到请求参数：{}", param);
        return param;
    }


}
