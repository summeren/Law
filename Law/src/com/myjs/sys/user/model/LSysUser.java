package com.myjs.sys.user.model;
// Generated 2017/2/22 �U�� 02:42:41 by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * LSysUser generated by hbm2java
 */
@Entity
@Table(name = "L_SYS_USER", schema = "dbo", catalog = "Legal")
public class LSysUser implements java.io.Serializable {

	private static final long serialVersionUID = 8674983946855221513L;
	private String userId;
	private String userCname;
	private String userPassword;
	private String userStatus;
	private String userEmail;
	private Date createdate;
	private Date modifydate;
	private Set<LSysUserDepart> LSysUserDeparts = new HashSet<LSysUserDepart>(0);

	public LSysUser() {
	}

	public LSysUser(String userId, String userCname, String userPassword, String userStatus, String userEmail) {
		this.userId = userId;
		this.userCname = userCname;
		this.userPassword = userPassword;
		this.userStatus = userStatus;
		this.userEmail = userEmail;
	}

	public LSysUser(String userId, String userCname, String userPassword, String userStatus, String userEmail,
			Date createdate, Date modifydate, Set<LSysUserDepart> LSysUserDeparts) {
		this.userId = userId;
		this.userCname = userCname;
		this.userPassword = userPassword;
		this.userStatus = userStatus;
		this.userEmail = userEmail;
		this.createdate = createdate;
		this.modifydate = modifydate;
		this.LSysUserDeparts = LSysUserDeparts;
	}

	@Id

	@Column(name = "USER_ID", unique = true, nullable = false, length = 50)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "USER _CNAME", nullable = false, length = 10)
	public String getUserCname() {
		return this.userCname;
	}

	public void setUserCname(String userCname) {
		this.userCname = userCname;
	}

	@Column(name = "USER_PASSWORD", nullable = false, length = 20)
	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "USER _STATUS", nullable = false, length = 1)
	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	@Column(name = "USER_EMAIL", nullable = false, length = 150)
	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATEDATE", length = 23)
	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFYDATE", length = 23)
	public Date getModifydate() {
		return this.modifydate;
	}

	public void setModifydate(Date modifydate) {
		if(modifydate==null){
			this.modifydate = new Date();
		}else{
			this.modifydate = modifydate;
		}
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "LSysUser")
	public Set<LSysUserDepart> getLSysUserDeparts() {
		return this.LSysUserDeparts;
	}

	public void setLSysUserDeparts(Set<LSysUserDepart> LSysUserDeparts) {
		this.LSysUserDeparts = LSysUserDeparts;
	}

}
