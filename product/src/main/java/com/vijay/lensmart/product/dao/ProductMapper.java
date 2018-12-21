package com.vijay.lensmart.product.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class ProductMapper  implements RowMapper<Product> {
	 
		   public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			   Product product = new Product();
			   product.setPid(rs.getInt("id"));
			   product.setPname(rs.getString("name"));
			   product.setPprice(rs.getInt("price"));
			   product.setPdescription(rs.getString("description"));
		      return product;
		   }
}
