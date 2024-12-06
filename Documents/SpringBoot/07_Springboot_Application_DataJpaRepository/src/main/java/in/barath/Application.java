package in.barath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.barath.service.PersonService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		// IOC will start

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
// get bean object
		PersonService bean = context.getBean(PersonService.class);

// calling the bean method
//		bean.savePerson();
//		bean.getPerson();
//		bean.getPersonSort();
		bean.getPersonPagination();

	}

}
