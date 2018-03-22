package com.yijigu.springbootdemo.service;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import com.yijigu.springbootdemo.domain.SysAccount;

public interface SysAccountService {
    PageInfo<SysAccount> queryPageList(SysAccount sysAccount, PageRowBounds pageRowBounds);
}
