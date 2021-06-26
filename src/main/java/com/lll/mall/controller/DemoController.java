package com.lll.mall.controller;

import com.lll.mall.domain.UmsMember;
import com.lll.mall.service.DemoService;
import com.lll.mall.service.impl.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author luoling
 * @date 2021/6/25 11:04
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UmsMemberService umsMemberService;

    @RequestMapping("/get")
    public List<UmsMember> get() {
        return umsMemberService.queryIdLargerThan3AndSmallerThan5();
    }

    @RequestMapping("/get")
    public List<UmsMember> mockConfict() {
        return umsMemberService.queryIdLargerThan3AndSmallerThan5();
    }
}
