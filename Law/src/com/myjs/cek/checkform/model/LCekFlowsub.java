package com.myjs.cek.checkform.model;
// Generated 2017/3/23 �U�� 01:55:51 by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LCekFlow generated by hbm2java
 */
@Entity
@Table(name = "L_CEK_FLOWSUB", schema = "dbo", catalog = "Legal")
public class LCekFlowsub{
	private String flowsubId;
	private String flowsubName;
	private int flowsubStyle;
	private int flowsubLevel;
	private String flowId;
	private Date createDatetime;
	private String createUserId;
	private Date modifyDatetime;
	private String modifyUserId;
	private String isDelete;

	public LCekFlowsub() {
	}

	public LCekFlowsub(String flowsubId, String flowsubName, int flowsubStyle, int flowsubLevel, String flowId, Date createDatetime,
			String createUserId, Date modifyDatetime, String modifyUserId, String isDelete) {
		this.flowsubId = flowsubId;
		this.flowsubName = flowsubName;
		this.flowsubStyle = flowsubStyle;
		this.flowsubLevel = flowsubLevel;
		this.flowId = flowId;
		this.createDatetime = createDatetime;
		this.createUserId = createUserId;
		this.modifyDatetime = modifyDatetime;
		this.modifyUserId = modifyUserId;
		this.isDelete = isDelete;
	}

	@Id

	@Column(name = "flowsub_id", unique = true, nullable = false, length = 50)
	public String getFlowsubId() {
		return this.flowsubId;
	}

	public void setFlowsubId(String flowsubId) {
		this.flowsubId = flowsubId;
	}

	public String getFlowsubName() {
		return flowsubName;
	}

	public void setFlowsubName(String flowsubName) {
		this.flowsubName = flowsubName;
	}

	public int getFlowsubStyle() {
		return flowsubStyle;
	}

	public void setFlowsubStyle(int flowsubStyle) {
		this.flowsubStyle = flowsubStyle;
	}

	public int getFlowsubLevel() {
		return flowsubLevel;
	}

	public void setFlowsubLevel(int flowsubLevel) {
		this.flowsubLevel = flowsubLevel;
	}

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getModifyDatetime() {
		return modifyDatetime;
	}

	public void setModifyDatetime(Date modifyDatetime) {
		this.modifyDatetime = modifyDatetime;
	}

	public String getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(String modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}


}
