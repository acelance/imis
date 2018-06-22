package com.iotch.entity;

public class RoleAuthority {
    private RoleInfo roleInfo;//角色信息
    private AuthorityInfo authorityInfo;//每个菜单的权限信息

    public RoleAuthority() {
    }

    public RoleAuthority(RoleInfo roleInfo, AuthorityInfo authorityInfo) {
        this.roleInfo = roleInfo;
        this.authorityInfo = authorityInfo;
    }

    @Override
    public String toString() {
        return "RoleAuthority{" +
                "roleInfo=" + roleInfo +
                ", authorityInfo=" + authorityInfo +
                '}';
    }

    public RoleInfo getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }

    public AuthorityInfo getAuthorityInfo() {
        return authorityInfo;
    }

    public void setAuthorityInfo(AuthorityInfo authorityInfo) {
        this.authorityInfo = authorityInfo;
    }
}
