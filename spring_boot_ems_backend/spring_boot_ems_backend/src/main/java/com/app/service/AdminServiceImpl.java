package com.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.SignUp;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Override
	public SignUp adminRegistration(SignUp reqDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
