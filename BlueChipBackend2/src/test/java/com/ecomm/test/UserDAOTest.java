package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.UserDAO;
import com.ecomm.model.UserDetail;

public class UserDAOTest
{	@Autowired
	static UserDAO userDAO;

	
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		
		userDAO=(UserDAO)context.getBean("userDAO");
	}
	@Ignore
	@Test
	public void registerUserTest()
	{
		UserDetail user=new UserDetail();
		
		user.setUsername("Yog");
		user.setAddress("Baroda");
		user.setEmailId("yog@gmail.com");
		user.setMoblieNo("9090909090");
		user.setPassword("pass1234");
		user.setRole("ROLE_USER");
		
		
		assertTrue("Problem in Redistering the user:",userDAO.registerUser(user));
	}
	
}
