/**
 * 
 */
package com.b2b.dbservice.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.b2b.dbservice.dao.SignUpDAO;
import com.b2b.dbservice.model.DD_B2B_CUSTOMER;

/**
 * @author nedumaran.rasu
 *
 */

public class SignupServiceImplTest {

	@InjectMocks
	private SignupServiceImpl signupService;

	@Mock
	private SignUpDAO signupRepository;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void getUserbyIdTest() {

		Long userId = new Long(2029726);
		DD_B2B_CUSTOMER data = new DD_B2B_CUSTOMER(userId, "kalidass", "kalidass@gmail.com");
		when(signupRepository.getUserbyId(userId)).thenReturn(data);
		DD_B2B_CUSTOMER respEnt = signupService.getUserbyId(userId);
		assertEquals(userId, respEnt.getCST_ID());
	}

}
