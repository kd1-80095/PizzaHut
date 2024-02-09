package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.SigninRequest;
import com.app.dto.SigninResponse;
import com.app.dto.SignUp;
import com.app.service.CustomerService;
//import com.app.security.JwtUtils;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerSignInSignUpController {
	@Autowired
	private CustomerService customerService;
//	@Autowired
//	private JwtUtils utils;
//
//	@Autowired
//	private AuthenticationManager mgr;

	// sign up
	@PostMapping("/signUp")
	public ResponseEntity<?> customerSignup(@RequestBody @Valid SignUp dto) {
		System.out.println("in sign up " + dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(customerService.customerRegistration(dto));
	}

	
	@PostMapping("/signIn")
	public ResponseEntity<?> signinCustomer(@RequestBody @Valid SigninRequest reqDTO) {
		System.out.println("in signin " + reqDTO);
		return ResponseEntity
			.ok(new SigninResponse( "Successful Authentication!!!"));
		

//		Authentication verifiedAuth = mgr
//				.authenticate(new UsernamePasswordAuthenticationToken
//						(reqDTO.getEmail(), reqDTO.getPassword()));
//		System.out.println(verifiedAuth.getClass());// Custom user details
//		// => auth success
//		return ResponseEntity
//				.ok(new SigninResponse(utils.generateJwtToken(verifiedAuth), "Successful Authentication!!!"));

	}

}

