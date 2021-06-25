package com.lll.mall.service.impl;

import com.lll.mall.dao.DemoDao;
import com.lll.mall.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luoling
 * @date 2021/6/25 11:15
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    @Override
    public String get() {
        return demoDao.get();
    }
}
