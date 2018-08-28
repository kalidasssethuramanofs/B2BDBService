package com.b2b.dbservice.model;

import java.io.Serializable;

public class DD_CUSTOMER implements Serializable {

	private Integer CST_ID;

	private String CST_FNAME;

	private String CST_LNAME;

	private String CST_EMAIL;

	public DD_CUSTOMER() {

	}

	public DD_CUSTOMER(Integer CST_ID, String CST_FNAME, String CST_LNAME, String CST_EMAIL) {
		this.CST_ID = CST_ID;
		this.CST_FNAME = CST_FNAME;
		this.CST_LNAME = CST_LNAME;
		this.CST_EMAIL = CST_EMAIL;
	}

	public Integer getCST_ID() {
		return CST_ID;
	}

	public void setCST_ID(Integer cST_ID) {
		CST_ID = cST_ID;
	}

	public String getCST_FNAME() {
		return CST_FNAME;
	}

	public void setCST_FNAME(String cST_FNAME) {
		CST_FNAME = cST_FNAME;
	}

	public String getCST_LNAME() {
		return CST_LNAME;
	}

	public void setCST_LNAME(String cST_LNAME) {
		CST_LNAME = cST_LNAME;
	}

	public String getCST_EMAIL() {
		return CST_EMAIL;
	}

	public void setCST_EMAIL(String cST_EMAIL) {
		CST_EMAIL = cST_EMAIL;
	}

}
