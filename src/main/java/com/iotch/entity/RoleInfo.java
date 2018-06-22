package com.iotch.entity;

import java.sql.Timestamp;
import java.util.List;

public class RoleInfo {
    private String roleCode;//角色编码
    private String roleName;//角色名称
    private String roleDesc;//角色备注
    private String superiorRole;//上级角色等级编码
    private String roleStatus;//角色状态
    private Timestamp createTime;//创建时间
    private Timestamp lastEditTime;//最后编辑时间
    private String roleType;//角色类型(0:超级管理员,1:运行商类,2:员工类)
    private List<RoleInfo> subRoleList;//该角色下属可以管理的角色

    public RoleInfo() {
    }

    public RoleInfo(String roleCode, String roleName, String roleDesc, String superiorRole, String roleStatus, Timestamp createTime, Timestamp lastEditTime, String roleType, List<RoleInfo> subRoleList) {
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.superiorRole = superiorRole;
        this.roleStatus = roleStatus;
        this.createTime = createTime;
        this.lastEditTime = lastEditTime;
        this.roleType = roleType;
        this.subRoleList = subRoleList;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", superiorRole='" + superiorRole + '\'' +
                ", roleStatus='" + roleStatus + '\'' +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                ", roleType='" + roleType + '\'' +
                ", subRoleList=" + subRoleList +
                '}';
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getSuperiorRole() {
        return superiorRole;
    }

    public void setSuperiorRole(String superiorRole) {
        this.superiorRole = superiorRole;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public List<RoleInfo> getSubRoleList() {
        return subRoleList;
    }

    public void setSubRoleList(List<RoleInfo> subRoleList) {
        this.subRoleList = subRoleList;
    }
}
