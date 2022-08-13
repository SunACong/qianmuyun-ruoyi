package com.ruoyi.appdemo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


public class AnodeChangeInfoApp {
	private long sn;
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private Date opTime;
	private int potId;
	private String rodPos;
	private int rodIdIn;
	private int rodIdOut;
	private String cbIdIn1;
	private String cbIdIn2;
	private String cbIdOut1;
	private String cbIdOut2;
	private String opUserId;
	private String opUserName;
	@JsonFormat(locale="zh", timezone="GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;
	public long getSn() {
		return sn;
	}
	public void setSn(long sn) {
		this.sn = sn;
	}
	public Date getOpTime() {
		return opTime;
	}
	public void setOpTime(Date opTime) {
		this.opTime = opTime;
	}
	public int getPotId() {
		return potId;
	}
	public void setPotId(int potId) {
		this.potId = potId;
	}
	public String getRodPos() {
		return rodPos;
	}
	public void setRodPos(String rodPos) {
		this.rodPos = rodPos;
	}
	public int getRodIdIn() {
		return rodIdIn;
	}
	public void setRodIdIn(int rodIdIn) {
		this.rodIdIn = rodIdIn;
	}
	public int getRodIdOut() {
		return rodIdOut;
	}
	public void setRodIdOut(int rodIdOut) {
		this.rodIdOut = rodIdOut;
	}
	public String getCbIdIn1() {
		return cbIdIn1;
	}
	public void setCbIdIn1(String cbIdIn1) {
		this.cbIdIn1 = cbIdIn1;
	}
	public String getCbIdIn2() {
		return cbIdIn2;
	}
	public void setCbIdIn2(String cbIdIn2) {
		this.cbIdIn2 = cbIdIn2;
	}
	public String getCbIdOut1() {
		return cbIdOut1;
	}
	public void setCbIdOut1(String cbIdOut1) {
		this.cbIdOut1 = cbIdOut1;
	}
	public String getCbIdOut2() {
		return cbIdOut2;
	}
	public void setCbIdOut2(String cbIdOut2) {
		this.cbIdOut2 = cbIdOut2;
	}
	public String getOpUserId() {
		return opUserId;
	}
	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}
	public String getOpUserName() {
		return opUserName;
	}
	public void setOpUserName(String opUserName) {
		this.opUserName = opUserName;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "AnodeChangeInfo [sn=" + sn + ", opTime=" + opTime + ", potId=" + potId + ", rodPos=" + rodPos
				+ ", rodIdIn=" + rodIdIn + ", rodIdOut=" + rodIdOut + ", cbIdIn1=" + cbIdIn1 + ", cbIdIn2=" + cbIdIn2
				+ ", cbIdOut1=" + cbIdOut1 + ", cbIdOut2=" + cbIdOut2 + ", opUserId=" + opUserId + ", opUserName="
				+ opUserName + ", updateTime=" + updateTime + "]";
	}
	
}
