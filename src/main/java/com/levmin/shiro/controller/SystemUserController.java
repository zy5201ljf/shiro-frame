package com.levmin.shiro.controller;

import com.levmin.shiro.entity.SysUsers;
import com.levmin.shiro.entity.SystemUser;
import com.levmin.shiro.service.SysUsersService;
import com.levmin.shiro.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("system/user")
public class SystemUserController {

    @Autowired
    private SystemUserService systemUserService;

    @Autowired
    private SysUsersService sysUsersService;

    @PostMapping("/selectById")
    public SystemUser selectById(@RequestBody SystemUser systemUser) {
       return systemUserService.selectById(systemUser.getId());
    }

    @PostMapping("/insertUser")
    public SysUsers insertUser(@RequestBody SysUsers sysUsers) {
        return sysUsersService.createUser(sysUsers);
    }
}
