package com.iotch.entity;

import java.io.Serializable;

/**
 * 设备模块故障对应信息
 */
public class DevModuleStatus implements Serializable {
    private DevInfo devInfo;//设备信息
    private ModuleFault moduleFault;//模块故障信息

    public DevModuleStatus() {
    }

    public DevModuleStatus(DevInfo devInfo, ModuleFault moduleFault) {
        this.devInfo = devInfo;
        this.moduleFault = moduleFault;
    }

    @Override
    public String toString() {
        return "DevModuleStatus{" +
                "devInfo=" + devInfo +
                ", moduleFault=" + moduleFault +
                '}';
    }

    public DevInfo getDevInfo() {
        return devInfo;
    }

    public void setDevInfo(DevInfo devInfo) {
        this.devInfo = devInfo;
    }

    public ModuleFault getModuleFault() {
        return moduleFault;
    }

    public void setModuleFault(ModuleFault moduleFault) {
        this.moduleFault = moduleFault;
    }
}
