package com.iotch.entity;

import java.io.Serializable;

/**
 * 模块信息
 */
public class ModuleInfo implements Serializable {

    private String moduleCode;//模块编码
    private String moduleName;//模块名称

    public ModuleInfo() {
    }

    public ModuleInfo(String moduleCode, String moduleName) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
    }

    @Override
    public String toString() {
        return "ModuleInfo{" +
                "moduleCode='" + moduleCode + '\'' +
                ", moduleName='" + moduleName + '\'' +
                '}';
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
