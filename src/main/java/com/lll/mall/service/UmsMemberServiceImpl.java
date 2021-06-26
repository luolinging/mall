package com.lll.mall.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lll.mall.domain.UmsMember;
import com.lll.mall.mbg.mapper.UmsMemberMapper;
import com.lll.mall.service.impl.UmsMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luoling
 * @date 2021/6/25 23:00
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements UmsMemberService {


    @Override
    public List<UmsMember> queryIdLargerThan3AndSmallerThan5() {
        /*QueryWrapper<UmsMember> query = Wrappers.query();
        query.gt("id", 3);
        query.lt("id", 7);*/

        LambdaQueryWrapper<UmsMember> query = Wrappers.<UmsMember>lambdaQuery()
                .eq(UmsMember::getUsername, "111")
                .gt(UmsMember::getId, 3)
                .lt(UmsMember::getId, 7);
        return this.list(query);
    }
}