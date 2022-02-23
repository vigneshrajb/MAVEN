package com.vignesh.product.bo;

import com.vignesh.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	Product findProduct(int id);
	
}
