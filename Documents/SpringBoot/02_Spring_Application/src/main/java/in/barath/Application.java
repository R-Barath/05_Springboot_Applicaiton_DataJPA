package in.barath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "in.barath", "com.oracle.security" }) // to call all package's class and constructor
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println(context.getClass().getName());
		System.out.println(context.getBeanDefinitionCount()); // 59 boot frameworrks classes already available

	}

}
