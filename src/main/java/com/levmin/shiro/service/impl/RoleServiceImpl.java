package com.levmin.shiro.service.impl;

import com.levmin.shiro.entity.SysPermissions;
import com.levmin.shiro.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    /**
     * 创建权限角色
     * @param permission
     * @return
     */
    @Override
    public SysPermissions createPermission(SysPermissions permission) {
        return null;
    }

    /**
     * 删除权限
     * @param permissionId
     */
    @Override
    public void deletePermission(Long permissionId) {

    }
}
