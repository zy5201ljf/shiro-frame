package com.levmin.shiro.mapper;

import com.levmin.shiro.entity.SysUsers;
import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface SysUsersRepository {
    /**
     * 查询角色信息
     * @param sysUsers
     * @return
     */
    Set<String> findRolesByUser(SysUsers sysUsers);
}
