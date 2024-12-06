package in.barath.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.barath.entity.User;
import in.barath.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public void getAllUsers() {
		Iterable<User> all = userRepository.findAll();
		all.forEach(u -> {
			System.out.println(u);
		});
	}

	public void getCount() {
		userRepository.count();

	}

	public void getAllUsersHQL() {
		List<User> hql = userRepository.getAllUsersHQL();

		hql.forEach(System.out::println);

	}

	public void getAllUsersSQL() {
		List<User> sql = userRepository.getAllUsersSQL();
		sql.forEach(System.out::println);

	}

	public int updateNameByIdHQL(String name, int id) {
		return userRepository.updateNameByIdHQL(name, id);
	}

	public void addUser(int id, String country, String gender, String name) {
		userRepository.insertUserHQL(1, "USA", "Female", "Francy");
	}

	public void deleteUserByIdHQL(int id) {

		userRepository.deleteUserByIdHQL(id);
	}

	public void getUsersByCountry(String country) {
		List<User> byCountry = userRepository.findByCountry(country);
		byCountry.forEach(System.out::println);

	}

	public void getUsersByCountryAndGender(String country, String gender) {
		List<User> byCountry = userRepository.findByCountryAndGender(country, gender);
		byCountry.forEach(System.out::println);

	}

	public void deleteById(int eid) {
		userRepository.deleteById(2);
	}

	public void getUserById(int uid) {
		Optional<User> finding = userRepository.findById(uid);
		if (finding.isPresent()) {
			System.out.println(finding.get());
		} else {
			System.out.println("No record found");
		}
	}

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void deleteAllUser() {
		userRepository.deleteAll();
	}

	public void saveUsers() {
		User user = new User();
		user.setId(2);
		user.setName("Udit");
		user.setGender("Male");
		user.setCountry("India");

		User user1 = new User();
		user1.setId(3);
		user1.setName("Raj");
		user1.setGender("Male");
		user1.setCountry("India");

		User user2 = new User();
		user2.setId(4);
		user2.setName("Ram");
		user2.setGender("Male");
		user2.setCountry("India");

		List<User> res = Arrays.asList(user, user1, user2);
		userRepository.saveAll(res);
	}

	public void saveUser() {
		User userd = new User();
		userd.setId(2);
		userd.setName("Udit");
		userd.setGender("Male");
		userd.setCountry("India");
		userRepository.save(userd);

	}

}
