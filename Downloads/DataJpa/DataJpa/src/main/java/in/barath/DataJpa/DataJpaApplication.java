package in.barath.DataJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.barath.DataJpa.entity.Employee;
import in.barath.DataJpa.repo.EmployeeRepository;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplication.class, args);
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);

		Employee e1 = new Employee();
		e1.setEmpid(2);
		e1.setEmpName("Kumar");
		e1.setEmpSalary(155.00);
		employeeRepository.save(e1);
	}

}