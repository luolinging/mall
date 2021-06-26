package com.lll.mall.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lll.mall.domain.UmsMember;

import java.util.List;

/**
 * @author luoling
 * @date 2021/6/25 23:02
 */
public interface UmsMemberService extends IService<UmsMember> {

        List<UmsMember> queryIdLargerThan3AndSmallerThan5();
}
