package in.barath.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.barath.dao.ProductDao;

@Service
public class ServiceDao {

	private ProductDao productDao;

	@Autowired
	public void setDao(ProductDao productDao) {
		this.productDao = productDao;

	}

	// without above setter method also application is working as expected !!
	@Autowired

	public ServiceDao() {
		System.out.println("no- productDao called");
	}

	public ServiceDao(ProductDao productDao) {
		System.out.println("param- productDao called");
	}

	public void serviceDao() {
		productDao.saveProduct();
	}

}
