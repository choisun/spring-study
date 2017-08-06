package com.interpark.springstudy.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDaoImpl implements HomeDao{
	@Autowired
	private SqlSessionTemplate sql;
	
	@Override
	public String test() throws SQLException {
		return sql.selectOne("query.test");
	}
}
