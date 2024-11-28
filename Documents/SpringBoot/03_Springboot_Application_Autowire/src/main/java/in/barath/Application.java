package in.barath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.barath.dao.ProductDao;
import in.barath.service.ServiceDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductDao service = context.getBean(ProductDao.class);
		service.saveProduct();
	}

}
