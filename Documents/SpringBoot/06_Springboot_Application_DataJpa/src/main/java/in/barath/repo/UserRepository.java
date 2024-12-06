package in.barath.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.barath.entity.User;
import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("From User")
	public List<User> getAllUsersHQL();

	// Custom HQL insert method (not standard usage) by myself

	@Modifying
	@Transactional
	@Query("INSERT INTO User (id, country, gender, name) SELECT :id, :country, :gender, :name FROM User")
	void insertUserHQL(@Param("id") int id, @Param("country") String country, @Param("gender") String gender,
			@Param("name") String name);

	@Modifying
	@Transactional
	@Query("update User u set u.name = ?1 where u.id=?2")
	int updateNameByIdHQL(String name, int id);

	@Modifying
	@Transactional
	@Query("DELETE FROM User u WHERE u.id = ?1")
	void deleteUserByIdHQL(int id);

	@Query(value = "Select * from user_info", nativeQuery = true)
	public List<User> getAllUsersSQL();

	// select * from user_info where country=?
	public List<User> findByCountry(String country);

	// select * from user_info where country=? and gender=?

	public List<User> findByCountryAndGender(String country, String gender); // And ,Or ,GreaterThan

}
