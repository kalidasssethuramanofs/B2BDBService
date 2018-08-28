package com.b2b.dbservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b2b.dbservice.dao.SignUpDAO;
import com.b2b.dbservice.model.DD_B2B_CUSTOMER;

@Service
public class SignupServiceImpl implements SignupService {

	@Autowired
	private SignUpDAO dao;

	@Override
	public DD_B2B_CUSTOMER signUp(DD_B2B_CUSTOMER user) {
		return dao.signUp(user);
	}

	@Override
	public DD_B2B_CUSTOMER getUserbyId(Long id) {
		return dao.getUserbyId(id);
	}

	@Override
	public DD_B2B_CUSTOMER signIn(DD_B2B_CUSTOMER user) {
		return dao.signIn(user);
	}

	/*
	 * @Override public List<DD_CUSTOMER> getUser() { return dao.getUser(); }
	 * 
	 * 
	 * 
	 * @Override public DD_CUSTOMER updateUser(int id, DD_CUSTOMER user) { return
	 * dao.updateUser(id, user); }
	 * 
	 * @Override public DD_CUSTOMER getUser(int id) { return dao.getUser(id); }
	 * 
	 * @Override public boolean deleteUser(int id) { return dao.deleteUser(id); }
	 * 
	 * @Override public DD_CUSTOMER getUserByuserMail(String userMail) { return
	 * dao.getUserByMail(userMail); }
	 * 
	 * 
	 * 
	 * @Override public DD_B2B_CUSTOMER deleteAccount(Integer id) { return
	 * dao.deleteAccountbyId(id); }
	 * 
	 * 
	 */
}
