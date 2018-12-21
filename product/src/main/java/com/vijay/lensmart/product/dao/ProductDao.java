package com.vijay.lensmart.product.dao;

import java.sql.JDBCType;
import java.util.List;

import javax.sql.DataSource;

public interface ProductDao {

		   public void setDataSource(DataSource ds);
		  
		   public void create(String name, Integer age);	   
		   
		   public Product getProduct(Integer id);
		   
		   public List<Product> listProducts();
		  
		   public void delete(Integer id);
		  
		   public void update(Integer id, Integer age);
		}
