package in.barath.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // The java class which is mapped to db table is called as entity class
@NoArgsConstructor
@Data // lombok
@AllArgsConstructor

public class Person {

	@Id
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private String country;

}
