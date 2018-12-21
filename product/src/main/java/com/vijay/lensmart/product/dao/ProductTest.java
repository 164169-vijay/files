package com.vijay.lensmart.product.dao;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ProductTest {
	 public static void main( String[] args )
	    {
	    	ApplicationContext context=new ClassPathXmlApplicationContext("springJDBC.xml");  
	        
	    	ProductJDBCTemplate productJDBCTemplate = 
	                (ProductJDBCTemplate)context.getBean("productJDBCTemplate");
	             
	             System.out.println("------Records Creation--------" );
	             productJDBCTemplate.create("Zara", 11);
	             productJDBCTemplate.create("Nuha", 2);
	             productJDBCTemplate.create("Ayan", 15);

	             System.out.println("------Listing Multiple Records--------" );
	             List<Product> products = productJDBCTemplate.listProducts();
	             
	             for (Product record : products) {
	                System.out.print("ID : " + record.getPid() );
	                System.out.print(", Name : " + record.getPname() );
	                System.out.println(", Age : " + record.getPprice());
	             }

	             System.out.println("----Updating Record with ID = 2 -----" );
	             productJDBCTemplate.update(2, 20);

	             System.out.println("----Listing Record with ID = 2 -----" );
	             Product Product = productJDBCTemplate.getProduct(2);
	             System.out.print("ID : " + Product.getPid() );
	             System.out.print(", Name : " + Product.getPname() );
	             System.out.println(", Age : " + Product.getPprice());
	          }
	      
}
