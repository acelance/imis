package com.iotch.entity;

import java.io.Serializable;

/**
 * 模块故障信息
 */
public class ModuleFault implements Serializable {
    private String modFaultCode;//模块故障编码
    private String modFualtName;//模块故障名称
    private ModuleInfo moduleInfo;//模块信息

    public ModuleFault() {
    }

    public ModuleFault(String modFaultCode, String modFualtName, ModuleInfo moduleInfo) {
        this.modFaultCode = modFaultCode;
        this.modFualtName = modFualtName;
        this.moduleInfo = moduleInfo;
    }

    @Override
    public String toString() {
        return "ModuleFault{" +
                "modFaultCode='" + modFaultCode + '\'' +
                ", modFualtName='" + modFualtName + '\'' +
                ", moduleInfo=" + moduleInfo +
                '}';
    }

    public String getModFaultCode() {
        return modFaultCode;
    }

    public void setModFaultCode(String modFaultCode) {
        this.modFaultCode = modFaultCode;
    }

    public String getModFualtName() {
        return modFualtName;
    }

    public void setModFualtName(String modFualtName) {
        this.modFualtName = modFualtName;
    }

    public ModuleInfo getModuleInfo() {
        return moduleInfo;
    }

    public void setModuleInfo(ModuleInfo moduleInfo) {
        this.moduleInfo = moduleInfo;
    }
}
