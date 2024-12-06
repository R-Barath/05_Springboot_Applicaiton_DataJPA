package in.barath.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.barath.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
