package com.sistemaSalud.mapper;

import com.sistemaSalud.dto.UsuarioDTO;
import com.sistemaSalud.model.Usuario;

public class UsuarioDTOMapper {
	
	public static UsuarioDTO toUsuarioDTO(Usuario usuario) {
		
		if( usuario == null) {
			return null;
		}else {
			return UsuarioDTO.builder().id(usuario.getId()).identification(usuario.getIdentificacion()).name(usuario.getNombre()).email(usuario.getCorreo()).phone(usuario.getTelefono()).password(usuario.getContraseña()).role(usuario.getRol()).build();
		}
	}

}
