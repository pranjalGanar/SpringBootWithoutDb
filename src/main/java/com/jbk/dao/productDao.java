package com.jbk.dao;

import com.jbk.service.Product;

public interface productDao {

	public String saveproduct(Product product);
	public Product getproductById(String productId);
}
