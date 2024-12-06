package in.barath.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // to generate default constructor
@AllArgsConstructor // to generate para constructor
@Entity
@Table(name = "USER_INFO") // optional
public class User {

	@Id
	@Column(name = "USER_ID") // optional
	private Integer id;
	private String name;
	private String gender;
	private String country;

	@CreationTimestamp // automatically created date will be inserted in the table
	@Column(updatable=false)
	private LocalDate createdAt; // populate the data is create in the database

	@UpdateTimestamp // to track when the appl has happening some actions
	@Column(insertable=false)
	private LocalDate lastUpdated; // populate the data is deleted in the database

}
