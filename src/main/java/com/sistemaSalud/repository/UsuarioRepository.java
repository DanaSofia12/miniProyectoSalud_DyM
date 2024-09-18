package com.sistemaSalud.repository;

import java.util.List;

import com.sistemaSalud.model.Usuario;

public interface UsuarioRepository {

	int saveUsuario(Usuario usuario);

	List<Usuario> getAllUsuarios();

	Usuario getUsuarioById(Long id);

	int updateUsuarios(Usuario usuario);

	int deleteUsuarios(Integer id);

}
