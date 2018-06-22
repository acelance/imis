package com.iotch.entity;

import java.sql.Timestamp;

/**
 * 设备激活码管理类
 *      该类用于设备与其激活码的一一对应,
 *      激活码创建时间与其他类创建时间不一样,并非创建以后不更新,若机器激活码已经过去,该机器可以重新生成新的激活码,以供运营商续费使用,或新的运营商领取使用;
 *      因此,激活码创建更新要遵循以下规则
 *      A.超级管理员
 *      1.创建更新激活码之前检验该数据库是否存在对应该设备的激活码,
 *      2.若存在请确认是否已经过期,
 *      3.若存在,并且没有过期,请务必提醒超级管理员,强制更新后该原来该激活码对应设备的设备将变成不可用的状态
 *      B.总运营商
 *      1.创建更新激活码之前检验该数据库是否存在对应该设备的激活码,
 *      2.若存在请确认是否已经过期,
 *      3.若存在,并且没有过期,请务必提醒,没有强制更改权限,请与超级管理员,使用该设备该设备运营商三方协商后由超级管理员更新
 *      C.其他人
 *      1.没有查看或修改权限
 */
public class DevActiveCode {
    private String devCode;//设备编码
    private String activeCode;//激活码
    private Timestamp createTime;//创建时间
    private Timestamp usefulTime;//有效时间至
    private Timestamp lastEditTime;//修改时间
    private String ativeNote;//激活码备注

    public DevActiveCode() {
    }

    public DevActiveCode(String devCode, String activeCode, Timestamp createTime, Timestamp usefulTime, Timestamp lastEditTime, String ativeNote) {
        this.devCode = devCode;
        this.activeCode = activeCode;
        this.createTime = createTime;
        this.usefulTime = usefulTime;
        this.lastEditTime = lastEditTime;
        this.ativeNote = ativeNote;
    }

    @Override
    public String toString() {
        return "DevActiveCode{" +
                "devCode='" + devCode + '\'' +
                ", activeCode='" + activeCode + '\'' +
                ", createTime=" + createTime +
                ", usefulTime=" + usefulTime +
                ", lastEditTime=" + lastEditTime +
                ", ativeNote='" + ativeNote + '\'' +
                '}';
    }

    public String getDevCode() {
        return devCode;
    }

    public void setDevCode(String devCode) {
        this.devCode = devCode;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUsefulTime() {
        return usefulTime;
    }

    public void setUsefulTime(Timestamp usefulTime) {
        this.usefulTime = usefulTime;
    }

    public Timestamp getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Timestamp lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getAtiveNote() {
        return ativeNote;
    }

    public void setAtiveNote(String ativeNote) {
        this.ativeNote = ativeNote;
    }
}
