package com.dhrj.java.zsitking.entity;

/**
 * @Created: by 2022-07-01 18:43
 * @Description: 账户类
 * @Author: 张松
 * @Blog: <a href="https://blog.csdn.net/qq_39038178"/>
 * @VCS: <a href="https://github.com/GuiZhouAndroid"/>
 * @Copyright: 辽宁省-大连市-东华软件大连分公司
 */
public class Accounts {
    private Integer aId;
    private String aName;
    private String aContact;

    public Accounts() {
    }

    public Accounts(Integer aId, String aName, String aContact) {
        this.aId = aId;
        this.aName = aName;
        this.aContact = aContact;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaContact() {
        return aContact;
    }

    public void setaContact(String aContact) {
        this.aContact = aContact;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aContact='" + aContact + '\'' +
                '}';
    }
}
