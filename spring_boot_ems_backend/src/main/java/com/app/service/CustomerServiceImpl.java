package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CustomerEntityDao;
import com.app.dto.SignUp;
import com.app.entities.CustomerEntity;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	//dep : dao layer i/f
		@Autowired
		private CustomerEntityDao customerDao;
		//dep
		@Autowired
		private ModelMapper mapper;
		//dep 
//		@Autowired
//		private PasswordEncoder encoder;

	@Override
	public SignUp customerRegistration(SignUp reqDTO) {
		//dto --> entity
				CustomerEntity user=mapper.map(reqDTO, CustomerEntity.class);
//				user.setPassword(encoder.encode(user.getPassword()));//pwd : encrypted using SHA
				return mapper.map(customerDao.save(user), SignUp.class);
	}
	

}

