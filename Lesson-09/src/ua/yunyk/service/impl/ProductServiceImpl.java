package ua.yunyk.service.impl;

import java.util.List;

import ua.yunyk.dao.ProductDao;
import ua.yunyk.dao.impl.ProductDaoImpl;
import ua.yunyk.domain.Product;
import ua.yunyk.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private static ProductService productServiceImpl;
	private ProductDao productDao;

	private ProductServiceImpl() {
		productDao = new ProductDaoImpl();
	}

	public static ProductService getProductService() {
		if (productServiceImpl == null) {
			productServiceImpl = new ProductServiceImpl();
		}

		return productServiceImpl;
	}

	@Override
	public Product create(Product t) {
		return productDao.create(t);
	}

	@Override
	public Product read(Integer id) {
		return productDao.read(id);
	}

	@Override
	public Product update(Product t) {
		return productDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		productDao.delete(id);
	}

	@Override
	public List<Product> readAll() {
		return productDao.readAll();
	}

}
