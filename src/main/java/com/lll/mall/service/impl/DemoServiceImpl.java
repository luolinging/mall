package com.lll.mall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lll.mall.domain.UmsMember;
import com.lll.mall.mbg.mapper.UmsMemberMapper;
import com.lll.mall.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author luoling
 * @date 2021/6/25 11:15
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Override
    public UmsMember get() {
        LambdaQueryWrapper<UmsMember> wrapper = Wrappers.<UmsMember>lambdaQuery().eq(UmsMember::getId, 1);
        return umsMemberMapper.selectOne(wrapper);
    }
}
