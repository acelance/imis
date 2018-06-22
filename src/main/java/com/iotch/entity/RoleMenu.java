package com.iotch.entity;

public class RoleMenu {
    private RoleInfo roleInfo;//角色信息
    private MenuInfo menuInfo;//菜单信息

    public RoleMenu() {
    }

    public RoleMenu(RoleInfo roleInfo, MenuInfo menuInfo) {
        this.roleInfo = roleInfo;
        this.menuInfo = menuInfo;
    }

    @Override
    public String toString() {
        return "RoleMenu{" +
                "roleInfo=" + roleInfo +
                ", menuInfo=" + menuInfo +
                '}';
    }

    public RoleInfo getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(RoleInfo roleInfo) {
        this.roleInfo = roleInfo;
    }

    public MenuInfo getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(MenuInfo menuInfo) {
        this.menuInfo = menuInfo;
    }
}
