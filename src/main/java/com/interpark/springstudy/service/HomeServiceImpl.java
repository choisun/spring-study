package com.interpark.springstudy.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interpark.springstudy.dao.HomeDao;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDao homeDao;
	
	@Override
	public String test() throws SQLException {
		return homeDao.test();
	}

}
