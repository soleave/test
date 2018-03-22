package com.yijigu.springbootdemo.dao;

import com.github.pagehelper.PageRowBounds;
import com.yijigu.springbootdemo.domain.SysAccount;

import java.util.List;

public interface SysAccountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysAccount record);

    int insertSelective(SysAccount record);

    SysAccount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysAccount record);

    int updateByPrimaryKey(SysAccount record);

    List<SysAccount> queryPageList(SysAccount sysAccount, PageRowBounds pageRowBounds);
}