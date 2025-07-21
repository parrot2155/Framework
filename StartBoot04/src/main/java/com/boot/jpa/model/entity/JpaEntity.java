package com.boot.jpa.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="MYBOARD")
public class JpaEntity {
//dto랑 생김새는 같지만 목적이 다르다.
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int myno;
	
	@Column(updatable=false, nullable=false)
	private String myname;
	@Column
	private String mytitle;
	@Column(name="MYCONTENT")
	private String mycontent;
	
	@Column(updatable=false)
	@Temporal(TemporalType.DATE)
	private Date mydate;
	
	public JpaEntity() {
	}
	public JpaEntity(int myno, String myname, String mytitle, String mycontent, Date mydate) {
		super();
		this.myno = myno;
		this.myname = myname;
		this.mytitle = mytitle;
		this.mycontent = mycontent;
		this.mydate = mydate;
	}
	public int getMyno() {
		return myno;
	}
	public void setMyno(int myno) {
		this.myno = myno;
	}
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	public String getMytitle() {
		return mytitle;
	}
	public void setMytitle(String mytitle) {
		this.mytitle = mytitle;
	}
	public String getMycontent() {
		return mycontent;
	}
	public void setMycontent(String mycontent) {
		this.mycontent = mycontent;
	}
	public Date getMydate() {
		return mydate;
	}
	public void setMydate(Date mydate) {
		this.mydate = mydate;
	}
	
	
}
