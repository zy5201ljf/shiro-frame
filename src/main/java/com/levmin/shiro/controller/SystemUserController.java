package com.levmin.shiro.controller;

import com.levmin.shiro.entity.SystemUser;
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

    @PostMapping("/selectById")
    public SystemUser selectById(@RequestBody SystemUser systemUser) {
       return systemUserService.selectById(systemUser.getId());
    }
}
