package com.boot.jpa.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MYMEMBER")
public class MemberEntity {
	
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int memberno;
	
	@Column(updatable=false, nullable=false)
	private String memberid;
	
	@Column
	private String memberpw;
	
	@Column
	private String membername;

	public MemberEntity() {
	}

	public MemberEntity(int memberno, String memberid, String memberpw, String membername) {
		super();
		this.memberno = memberno;
		this.memberid = memberid;
		this.memberpw = memberpw;
		this.membername = membername;
	}

	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getMemberpw() {
		return memberpw;
	}

	public void setMemberpw(String memberpw) {
		this.memberpw = memberpw;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}
	
	
}
