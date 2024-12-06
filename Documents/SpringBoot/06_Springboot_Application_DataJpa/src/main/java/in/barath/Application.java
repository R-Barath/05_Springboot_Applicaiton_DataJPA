package in.barath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.barath.service.UserService;

@SpringBootApplication(scanBasePackages = { "in.barath" })
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserService userService = context.getBean(UserService.class);
//		userService.saveUser();
////		userService.deleteAllUser();
//		userService.saveUsers();
//		userService.getAllUsers();
//		userService.getUserById(8);
//		userService.deleteById(2);  //task has done by me
//		userService.getCount();//task has done by me
//
//		userService.getUsersByCountry("India");
//		userService.getUsersByCountryAndGender("India", "Male");
		userService.getAllUsersHQL();
//		userService.getAllUsersSQL();
//		userService.updateUserEmailByIdHQL();
//		userService.updateNameByIdHQL("Ramu", 3);  //has been completed by myself
//		userService.deleteUserByIdHQL(3);
//		System.out.println("Inserting a new user record...");
//		userService.addUser(1, "USA", "Female", "Francy");

	}

}
