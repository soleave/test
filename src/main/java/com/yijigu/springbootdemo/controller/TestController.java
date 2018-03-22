package com.yijigu.springbootdemo.controller;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageRowBounds;
import com.yijigu.springbootdemo.domain.SysAccount;
import com.yijigu.springbootdemo.service.SysAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private SysAccountService sysAccountService;

    @RequestMapping("getAccount")
    public PageInfo<SysAccount> getAccount(@RequestParam("page") int page,@RequestParam("limit")  int limit){

        PageInfo<SysAccount> pageInfo = sysAccountService.queryPageList(new SysAccount(),new PageRowBounds(page,limit));
        return  pageInfo;
    }
}
