package com.sistemaSalud.mapper;

import com.sistemaSalud.dto.UsuarioDTO;
import com.sistemaSalud.model.Usuario;

public class UsuarioMapper {
	
	public static Usuario toUsuario(UsuarioDTO usuarioDTO) {
		
		if (usuarioDTO == null) {
			return null;
		} else {
			return Usuario.builder().id(usuarioDTO.getId()).identificacion(usuarioDTO.getIdentification()).nombre(usuarioDTO.getName()).correo(usuarioDTO.getEmail()).telefono(usuarioDTO.getPhone()).contraseña(usuarioDTO.getPassword()).rol(usuarioDTO.getRole()).build();
		}
		
	}

}
