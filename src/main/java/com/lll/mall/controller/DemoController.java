package com.lll.mall.controller;

import com.lll.mall.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoling
 * @date 2021/6/25 11:04
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/get")
    public String get() {
        return demoService.get();
    }
}
