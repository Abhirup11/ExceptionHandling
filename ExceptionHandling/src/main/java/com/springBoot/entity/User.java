package com.springBoot.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USERS_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class User {
	@Id
	@GeneratedValue
	private int userId;
	private String name;
	private String emailId;
	private String mobile;
	private int age;
	private String gender;
	private String nationality;

}
