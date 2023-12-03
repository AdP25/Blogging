package com.milkyway.blog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@NoArgsConstructor
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "user_name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "password", nullable = false, length = 20)
	private String password;
	
	@Column(name = "about", nullable = false, length = 120)
	private String about;
	
	@Column(name = "email", nullable = false, length = 30)
	private String email;
}
