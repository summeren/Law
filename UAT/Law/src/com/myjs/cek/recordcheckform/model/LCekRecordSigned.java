package com.myjs.cek.recordcheckform.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * LCekRecordCheckform generated by JiaJia
 */
@Entity
@Table(name = "L_CEK_RECORD_SIGNED", schema = "dbo", catalog = "Legal")
public class LCekRecordSigned implements java.io.Serializable {

	private static final long serialVersionUID = -5241557043026223998L;
	private String signedId;
	private int caseId;
	private String bankName;
	private String prodName;
	private String payer;
	private String payerRole;
	private String type;
	private int periods;
	private Date paytimeStart;
	private Date paytimeEnd;
	private int ammountP;
	private int ammountSum;
	private Date applyDate;
	private int status;
	private String backMark;
	private String applyUserId;
	private String receivedUserId;
	private Date applyDateTime;
	private String applyUserName;
	private String receivedUserName;
	private String ownerAgree;
	private String remark;
	

	public LCekRecordSigned() {

	}

	public LCekRecordSigned(String signedId, int caseId, String bankName, String prodName, String payer,
			String payerRole, String type, int periods, Date paytimeStart, Date paytimeEnd, int ammountP,
			int ammountSum, Date applyDate, int status, String backMark, String applyUserId,
			String receivedUserId, Date applyDateTime,String applyUserName,String receivedUserName,
			String ownerAgree, String remark) {
		this.signedId = signedId;
		this.caseId = caseId;
		this.bankName = bankName;
		this.prodName = prodName;
		this.payer = payer;
		this.payerRole = payerRole;
		this.type = type;
		this.periods = periods;
		this.paytimeStart = paytimeStart;
		this.paytimeEnd = paytimeEnd;
		this.ammountP = ammountP;
		this.ammountSum = ammountSum;
		this.applyDate = applyDate;
		this.status = status;
		this.backMark = backMark;
		this.applyUserId = applyUserId;
		this.receivedUserId = receivedUserId;
		this.applyDateTime = applyDateTime;
		this.applyUserName = applyUserName;
		this.receivedUserName = receivedUserName;
		this.ownerAgree = ownerAgree;
		this.remark = remark;
	}

	public String getSignedId() {
		return signedId;
	}

	public void setSignedId(String signedId) {
		this.signedId = signedId;
	}

	public int getCaseId() {
		return caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPayerRole() {
		return payerRole;
	}

	public void setPayerRole(String payerRole) {
		this.payerRole = payerRole;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPeriods() {
		return periods;
	}

	public void setPeriods(int periods) {
		this.periods = periods;
	}

	public Date getPaytimeStart() {
		return paytimeStart;
	}

	public void setPaytimeStart(Date paytimeStart) {
		this.paytimeStart = paytimeStart;
	}

	public Date getPaytimeEnd() {
		return paytimeEnd;
	}

	public void setPaytimeEnd(Date paytimeEnd) {
		this.paytimeEnd = paytimeEnd;
	}

	public int getAmmountP() {
		return ammountP;
	}

	public void setAmmountP(int ammountP) {
		this.ammountP = ammountP;
	}

	public int getAmmountSum() {
		return ammountSum;
	}

	public void setAmmountSum(int ammountSum) {
		this.ammountSum = ammountSum;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getBackMark() {
		return backMark;
	}

	public void setBackMark(String backMark) {
		this.backMark = backMark;
	}

	public String getApplyUserId() {
		return applyUserId;
	}

	public void setApplyUserId(String applyUserId) {
		this.applyUserId = applyUserId;
	}

	public String getReceivedUserId() {
		return receivedUserId;
	}

	public void setReceivedUserId(String receivedUserId) {
		this.receivedUserId = receivedUserId;
	}

	public Date getApplyDateTime() {
		return applyDateTime;
	}

	public void setApplyDateTime(Date applyDateTime) {
		this.applyDateTime = applyDateTime;
	}

	public String getApplyUserName() {
		return applyUserName;
	}

	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}

	public String getReceivedUserName() {
		return receivedUserName;
	}

	public void setReceivedUserName(String receivedUserName) {
		this.receivedUserName = receivedUserName;
	}

	public String getOwnerAgree() {
		return ownerAgree;
	}

	public void setOwnerAgree(String ownerAgree) {
		this.ownerAgree = ownerAgree;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}