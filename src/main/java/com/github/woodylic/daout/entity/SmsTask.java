package com.github.woodylic.daout.entity;

import java.math.BigInteger;
import java.util.Date;

public class SmsTask {

	private BigInteger id;

	private BigInteger userId;

	private String phoneNumber;

	private String msgContent;

	private Integer status;

	private Date createDate;

	private Date planSentTime;

	private Date actualSentTime;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getUserId() {
		return userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMsgContent() {
		return msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getPlanSentTime() {
		return planSentTime;
	}

	public void setPlanSentTime(Date planSentTime) {
		this.planSentTime = planSentTime;
	}

	public Date getActualSentTime() {
		return actualSentTime;
	}

	public void setActualSentTime(Date actualSentTime) {
		this.actualSentTime = actualSentTime;
	}

	@Override
	public String toString() {
		return "SmsTask{" +
				"id=" + id +
				", userId=" + userId +
				", phoneNumber='" + phoneNumber + '\'' +
				", msgContent='" + msgContent + '\'' +
				", status=" + status +
				", createDate=" + createDate +
				", planSentTime=" + planSentTime +
				", actualSentTime=" + actualSentTime +
				'}';
	}
}
