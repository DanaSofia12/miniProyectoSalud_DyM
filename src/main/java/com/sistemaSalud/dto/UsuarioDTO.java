package com.sistemaSalud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {
	
	private Long id;
	private Integer identification;
	private String name;
	private String email;
	private String phone;
	private String password;
	private String role;

}
