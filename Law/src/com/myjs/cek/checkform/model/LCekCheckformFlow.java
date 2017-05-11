package com.myjs.cek.checkform.model;
// Generated 2017/3/23 �U�� 01:55:51 by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LCekCheckformFlow generated by hbm2java
 */
@Entity
@Table(name = "L_CEK_CHECKFORM_FLOW", schema = "dbo", catalog = "Legal")
public class LCekCheckformFlow implements java.io.Serializable {

	private String checkformFlowId;
	private LCekCheckform LCekCheckform;
	private LCekFlow LCekFlow;

	public LCekCheckformFlow() {
	}

	public LCekCheckformFlow(String checkformFlowId, LCekCheckform LCekCheckform, LCekFlow LCekFlow) {
		this.checkformFlowId = checkformFlowId;
		this.LCekCheckform = LCekCheckform;
		this.LCekFlow = LCekFlow;
	}

	@Id

	@Column(name = "checkform_flow_id", unique = true, nullable = false, length = 50)
	public String getCheckformFlowId() {
		return this.checkformFlowId;
	}

	public void setCheckformFlowId(String checkformFlowId) {
		this.checkformFlowId = checkformFlowId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "checkform_id", nullable = false)
	public LCekCheckform getLCekCheckform() {
		return this.LCekCheckform;
	}

	public void setLCekCheckform(LCekCheckform LCekCheckform) {
		this.LCekCheckform = LCekCheckform;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "flow_id", nullable = false)
	public LCekFlow getLCekFlow() {
		return this.LCekFlow;
	}

	public void setLCekFlow(LCekFlow LCekFlow) {
		this.LCekFlow = LCekFlow;
	}

}
