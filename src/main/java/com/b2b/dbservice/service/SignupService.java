package com.b2b.dbservice.service;

import com.b2b.dbservice.model.DD_B2B_CUSTOMER;

public interface SignupService {

	DD_B2B_CUSTOMER signUp(DD_B2B_CUSTOMER user);

	DD_B2B_CUSTOMER getUserbyId(Integer id);

	DD_B2B_CUSTOMER signIn(DD_B2B_CUSTOMER ddB2BCustomer);

	/*
	 * List<DD_CUSTOMER> getUser(); DD_CUSTOMER updateUser(int id, DD_CUSTOMER
	 * user); DD_CUSTOMER getUser(int id); boolean deleteUser(int id); DD_CUSTOMER
	 * getUserByuserMail(String userMail); DD_B2B_CUSTOMER deleteAccount(Integer
	 * id);
	 */

}
