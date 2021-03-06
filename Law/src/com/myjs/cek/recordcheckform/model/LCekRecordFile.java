package com.myjs.cek.recordcheckform.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * LCekRecordFile generated by JiaJia
 */
@Entity
@Table(name = "L_CEK_RECORD_FILE", schema = "dbo", catalog = "Legal")
public class LCekRecordFile implements java.io.Serializable {

	private static final long serialVersionUID = -5241557043026223998L;
	private String recordFileId;
	private String fileId;
	private String fileName;
	private String filePath;
	private Date modifyDatetime;
	private String modifyUserId;
	private String recordCheckformId;

	public LCekRecordFile() {

	}

	public LCekRecordFile(String recordFileId, String fileId, String fileName, String filePath, Date modifyDatetime,
			String modifyUserId, String recordCheckformId) {
		this.recordFileId = recordFileId;
		this.fileId = fileId;
		this.fileName = fileName;
		this.filePath = filePath;
		this.modifyDatetime = modifyDatetime;
		this.modifyUserId = modifyUserId;
		this.recordCheckformId = recordCheckformId;
	}

	public String getRecordFileId() {
		return recordFileId;
	}

	public void setRecordFileId(String recordFileId) {
		this.recordFileId = recordFileId;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
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

	public String getRecordCheckformId() {
		return recordCheckformId;
	}

	public void setRecordCheckformId(String recordCheckformId) {
		this.recordCheckformId = recordCheckformId;
	}

	
}
