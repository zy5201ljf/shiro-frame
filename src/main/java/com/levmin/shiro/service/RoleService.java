package com.levmin.shiro.service;

import com.levmin.shiro.entity.SysPermissions;

public interface RoleService {
    public SysPermissions createPermission(SysPermissions permission);
    public void deletePermission(Long permissionId);
}
