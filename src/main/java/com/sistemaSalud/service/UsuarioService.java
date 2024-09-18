package com.sistemaSalud.service;

import java.util.List;

import com.sistemaSalud.dto.UsuarioDTO;

public interface UsuarioService {

	int saveUsuario(UsuarioDTO usuarioDTO);

	List<UsuarioDTO> getAllUsuarios();

	UsuarioDTO getUsuarioById(Long id);

	int updateUsuarios(UsuarioDTO usuarioDTO);

	int deleteUsuarios(Integer id);

}
