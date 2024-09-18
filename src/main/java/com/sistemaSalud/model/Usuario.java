package com.sistemaSalud.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
	
	private Long id;
	private Integer identificacion;
	private String nombre;
	private String correo;
	private String telefono;
	private String contraseña;
	private String rol;

}
