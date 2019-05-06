package com.ecomm.test;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.ecomm.dao.SupplierDAO;
import com.ecomm.model.Supplier;

public class SupplierDAOTest 
{
	 @Autowired
		public static SupplierDAO supplierDAO;
		
		@BeforeClass
		public static void excutedFirst()
		{
			AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
			context.scan("com.ecomm");
			context.refresh();
			
			supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		}
		@Ignore
		@Test
		public void addSupplierTest()
		{
			Supplier supplier=new Supplier();
			supplier.setSupplierId(2);
			supplier.setSupplierName("Yog");
			supplier.setSupplierAddr("Mumbai");
			
			assertTrue("Problem in supplier Insertion:",supplierDAO.addSupplier(supplier));
		}
}
