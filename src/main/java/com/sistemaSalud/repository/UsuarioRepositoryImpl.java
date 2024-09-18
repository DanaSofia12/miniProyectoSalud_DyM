package com.sistemaSalud.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sistemaSalud.mapper.UsuarioRowMapper;
import com.sistemaSalud.model.Usuario;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int saveUsuario(Usuario usuario) {
		StringBuilder query = new StringBuilder();
		query.append("INSERT INTO usuarios")
				.append("(id, identificacion, nombre, correo, telefono, contraseña, rol)")
				.append("VALUES (?,?,?,?,?,?,?)");
		
		Object[] params = { usuario.getId(), usuario.getIdentificacion(), usuario.getNombre(), usuario.getCorreo(), usuario.getTelefono(), usuario.getContraseña(), usuario.getRol() };
		
		return jdbcTemplate.update(query.toString(), params);
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		StringBuilder query = new StringBuilder();
		query.append("SELECT * FROM usuarios");
		
		return jdbcTemplate.query(query.toString(), new UsuarioRowMapper());
	}

	@Override
	public Usuario getUsuarioById(Long id) {

		try {
		StringBuilder query = new StringBuilder();
		query.append("SELECT * ")
				.append(" FROM usuarios")
				.append(" WHERE id = ?");
		return jdbcTemplate.queryForObject(query.toString(), new UsuarioRowMapper(), id);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public int updateUsuarios(Usuario usuario) {
		StringBuilder query = new StringBuilder();
		query.append("UPDATE usuarios ")
				.append(" SET nombre=?, correo=?, telefono=?, contraseña=?, rol=?  ")
				.append("WHERE id=?");
		
		Object[] params = { usuario.getNombre(), usuario.getCorreo(), usuario.getTelefono(), usuario.getContraseña(), usuario.getRol(), usuario.getId() };
		
		return jdbcTemplate.update(query.toString(), params);
	}

	@Override
	public int deleteUsuarios(Integer id) {
		String query = "DELETE FROM usuarios WHERE id=?";
		return jdbcTemplate.update(query, id);
	}

}
