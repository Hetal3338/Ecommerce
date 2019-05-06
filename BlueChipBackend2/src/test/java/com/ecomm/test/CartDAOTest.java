package com.ecomm.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ecomm.dao.CartDAO;
import com.ecomm.model.Cart;


public class CartDAOTest
{
	 @Autowired
		public static CartDAO cartDAO;
		
		@BeforeClass
		public static void excutedFirst()
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.ecomm");
			context.refresh();
			
			cartDAO=(CartDAO)context.getBean("CartDAO");
		}	
	@Test
	public void addCartTest()
	{
		Cart cartItem=new Cart();
		
		cartItem.setProductId(4);
		cartItem.setProductName("LG");
		cartItem.setPrice(5000);
		cartItem.setQuantity(3);
		cartItem.setPstatus("NP");
		cartItem.setUsername("Hetal");
		
		
		assertTrue("Problem inadding cartItem",cartDAO.addCartItem(cartItem));
		
	}
	public void listCartItems()
	{
		List<Cart> cartItemList=cartDAO.listCartItems("Hetal");
		assertTrue("Problem in list Cart Items",cartItemList.size()>0);
		
		for(Cart cart:cartItemList)
		{
			System.out.println(cart.getCartItemId()+":::");
			System.out.println(cart.getProductName()+":::");
			System.out.println(cart.getQuantity());
		}
	}

}
