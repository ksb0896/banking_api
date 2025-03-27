package com.axisbankltd.banking_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Name is mandatory")
	private String name;
	
	@Email(message = "Email not valid")
	@NotBlank(message = "Email cannot be blank")
	private String email;
	
	@Size(min = 10, max = 10, message = "Phone number should be 10 digits")
	private String phoneNumber;
}
