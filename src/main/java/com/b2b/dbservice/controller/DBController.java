package com.b2b.dbservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.b2b.dbservice.model.DD_B2B_CUSTOMER;
import com.b2b.dbservice.service.SignupService;

@Controller
public class DBController {

	@Autowired
	private SignupService service;

	@RequestMapping(value = "/signUp", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<DD_B2B_CUSTOMER> createUser(@RequestBody DD_B2B_CUSTOMER ddB2BCustomer) {

		DD_B2B_CUSTOMER b2bCustomer = service.signUp(ddB2BCustomer);
		return new ResponseEntity<DD_B2B_CUSTOMER>(b2bCustomer, HttpStatus.OK);
	}

	@RequestMapping(value = "/getCustomerById/{id}")
	public ResponseEntity<DD_B2B_CUSTOMER> getUserById(@PathVariable("id") Integer id) {
		DD_B2B_CUSTOMER b2bCustomer = service.getUserbyId(id);
		return new ResponseEntity<DD_B2B_CUSTOMER>(b2bCustomer, HttpStatus.OK);
	}

	@RequestMapping(value = "/signIn", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE, produces = {
			MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<DD_B2B_CUSTOMER> signIn(@RequestBody DD_B2B_CUSTOMER ddB2BCustomer) {
		DD_B2B_CUSTOMER b2bCustomer = service.signIn(ddB2BCustomer);
		return new ResponseEntity<DD_B2B_CUSTOMER>(b2bCustomer, HttpStatus.OK);
	}

}
