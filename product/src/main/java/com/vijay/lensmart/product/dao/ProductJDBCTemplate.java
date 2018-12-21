package com.vijay.lensmart.product.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProductJDBCTemplate implements ProductDao {
	
		   private DataSource dataSource;
		   private JdbcTemplate jdbcTemplateObject;
		   
		   public void setDataSource(DataSource dataSource) {
		      this.dataSource = dataSource;
		      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		   }
		   public void create(String name, Integer age) {
		      String SQL = "insert into Product (name, age) values (?, ?)";
		      jdbcTemplateObject.update( SQL, name, age);
		      System.out.println("Created Record Name = " + name + " Age = " + age);
		      return;
		   }
		   public void update(Integer id, Integer age){
			      String SQL = "update Product set age = ? where id = ?";
			      jdbcTemplateObject.update(SQL, age, id);
			      System.out.println("Updated Record with ID = " + id );
			      return;
			   }
		  
		   public void delete(Integer id) {
		      String SQL = "delete from Product where id = ?";
		      jdbcTemplateObject.update(SQL, id);
		      System.out.println("Deleted Record with ID = " + id );
		      return;
		   }
		   
		public Product getProduct(Integer pid) {
			
			      String SQL = "select * from Product where id = ?";
			      Product product = jdbcTemplateObject.queryForObject(SQL, 
			    	         new Object[]{pid}, new ProductMapper());
				return product;
			   }
		
	public List<Product> listProducts() {
		String SQL = "select * from Product";
			 List <Product> products = jdbcTemplateObject.query(SQL, new ProductMapper());
			      return products;
			   }
		
		}

