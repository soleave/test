package com.yijigu.springbootdemo.service.impl;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import com.yijigu.springbootdemo.dao.SysAccountMapper;
import com.yijigu.springbootdemo.domain.SysAccount;
import com.yijigu.springbootdemo.service.SysAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysAccountServiceImpl implements SysAccountService {
    @Autowired
    private SysAccountMapper sysAccountMapper;

    @Override
    public PageInfo<SysAccount> queryPageList(SysAccount sysAccount, PageRowBounds pageRowBounds) {
        List<SysAccount> list = sysAccountMapper.queryPageList(sysAccount,pageRowBounds);
        return new PageInfo<SysAccount>(list);
    }
}
