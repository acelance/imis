package com.iotch.entity;

public class RoleAuthority {
    private RoleInfo roleInfo;
    private AuthorityInfo authorityInfo;

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
