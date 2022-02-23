package com.vignesh.product.bo;

import com.vignesh.product.dao.ProductDAO;
import com.vignesh.product.dao.ProductDAOImpl;
import com.vignesh.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
