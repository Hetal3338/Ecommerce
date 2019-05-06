package com.ecomm.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.OrderDetailDAO;
import com.ecomm.model.OrderDetail;


public class OrderDetailDAOTest
{
	@Autowired
	public static OrderDetailDAO orderDetailDAO;
	
	@BeforeClass
	public static void excutedFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.ecomm");
		context.refresh();
		
		orderDetailDAO=(OrderDetailDAO)context.getBean("orderDetailDAO");
	}
	@Ignore
	@Test
	public void paymentProcessTest()
	{
		OrderDetail orderDetail=new OrderDetail();
		orderDetail.setUsername("Hetal");
		orderDetail.setAmount(45000);
		orderDetail.setOrderDate(new java.util.Date());
		orderDetail.setPmode("CC");
		
		assertTrue("Proble in order Proceessing",orderDetailDAO.paymentProcess(orderDetail));
		
		orderDetailDAO.updateCartItemStatus("Hetal");
		orderDetailDAO.updateOrderDetail("Hetal", orderDetail.getOrderId());
	}
	
}
