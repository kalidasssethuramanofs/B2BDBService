package com.b2b.dbservice.model;

import java.io.Serializable;

public class DD_B2B_CUSTOMER implements Serializable {

	private Long CST_ID;

	private String CST_EMAIL;

	private String CST_PASSWORD;

	public DD_B2B_CUSTOMER() {

	}

	public DD_B2B_CUSTOMER(Long CST_ID, String CST_EMAIL, String CST_PASSWORD) {
		this.CST_ID = CST_ID;
		this.CST_EMAIL = CST_EMAIL;
		this.CST_PASSWORD = CST_PASSWORD;
	}

	public Long getCST_ID() {
		return CST_ID;
	}

	public void setCST_ID(Long cST_ID) {
		CST_ID = cST_ID;
	}

	public String getCST_EMAIL() {
		return CST_EMAIL;
	}

	public void setCST_EMAIL(String cST_EMAIL) {
		CST_EMAIL = cST_EMAIL;
	}

	public String getCST_PASSWORD() {
		return CST_PASSWORD;
	}

	public void setCST_PASSWORD(String cST_PASSWORD) {
		CST_PASSWORD = cST_PASSWORD;
	}

}
