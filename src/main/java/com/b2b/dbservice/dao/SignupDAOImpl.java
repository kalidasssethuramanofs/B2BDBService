package com.b2b.dbservice.dao;

import org.springframework.stereotype.Service;

import com.b2b.dbservice.model.DD_B2B_CUSTOMER;

@Service
public class SignupDAOImpl implements SignUpDAO {

	@Override
	public DD_B2B_CUSTOMER signUp(DD_B2B_CUSTOMER user) {
		DD_B2B_CUSTOMER data = new DD_B2B_CUSTOMER();
		return data;
	}

	@Override
	public DD_B2B_CUSTOMER getUserbyId(Long id) {
		DD_B2B_CUSTOMER data = new DD_B2B_CUSTOMER();
		return data;
	}

	@Override
	public DD_B2B_CUSTOMER signIn(DD_B2B_CUSTOMER ddb2bCustomer) {

		DD_B2B_CUSTOMER data = new DD_B2B_CUSTOMER();
		return data;
	}

}
