package com.ruoyi.appdemo.domain;

public class InsertDemoApp {
    private String sn;
//    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private String opTime;
    private String potId;
    private String rodIdIn;
    private String rodIdOut;
    private String opUserName;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime;
    }

    public String getPotId() {
        return potId;
    }

    public void setPotId(String potId) {
        this.potId = potId;
    }

    public String getRodIdIn() {
        return rodIdIn;
    }

    public void setRodIdIn(String rodIdIn) {
        this.rodIdIn = rodIdIn;
    }

    public String getRodIdOut() {
        return rodIdOut;
    }

    public void setRodIdOut(String rodIdOut) {
        this.rodIdOut = rodIdOut;
    }

    public String getOpUserName() {
        return opUserName;
    }

    public void setOpUserName(String opUserName) {
        this.opUserName = opUserName;
    }

    @Override
    public String toString() {
        return "AnodeChangeInfo [sn=" + sn + ", opTime=" + opTime + ", potId=" + potId
                + ", rodIdIn=" + rodIdIn + ", rodIdOut=" + rodIdOut
                + ", cbIdOut1=" + ", opUserName="
                + opUserName + "]";
    }

}
