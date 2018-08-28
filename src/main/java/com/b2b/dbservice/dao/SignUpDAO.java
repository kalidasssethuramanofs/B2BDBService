package com.b2b.dbservice.dao;

import com.b2b.dbservice.model.DD_B2B_CUSTOMER;

public interface SignUpDAO {

	DD_B2B_CUSTOMER getUserbyId(Integer id);

	DD_B2B_CUSTOMER signUp(DD_B2B_CUSTOMER user);

	DD_B2B_CUSTOMER signIn(DD_B2B_CUSTOMER user);

}
