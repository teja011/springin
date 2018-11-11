package com.cg.trn.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee")
public class Trainee {
	@Id
	private int tid;
	private String tname;
	private String city;
	private String domain;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Trainee [tid=" + tid + ", tname=" + tname + ", city=" + city + ", domain=" + domain + "]";
	}
	

	
	
}
