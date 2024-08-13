package com.levmin.shiro.service;

import com.levmin.shiro.entity.SysUsers;

import java.util.Set;

public interface SysUsersService {
    //创建账户
    public SysUsers createUser(SysUsers sysUsers);
    //修改密码
    public void changePassword(Long userId, String newPassword);

    public Set<String> findRoles(SysUsers users);

    public SysUsers findByUsername(String username);

}
