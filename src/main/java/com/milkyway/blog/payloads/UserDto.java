package com.milkyway.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

/*
 * only those fields that are entered by the user directly
 * we can expose this data directly in the apis
 * we won't expose the main User entity
 * for data transfers we'll use dto class
 */
public class UserDto {

	private Long id;
	private String name;
	private String password;
	private String about;
	private String email;
}
