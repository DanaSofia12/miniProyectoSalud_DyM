package com.sistemaSalud.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sistemaSalud.model.Usuario;

public class UsuarioRowMapper implements RowMapper<Usuario> {
	
	@Override
	public Usuario mapRow(ResultSet rs, int RowNum) throws SQLException{
		
		return Usuario.builder().id(rs.getLong("id")).identificacion(rs.getInt("identificacion")).nombre(rs.getString("nombre")).correo(rs.getString("correo")).telefono(rs.getString("telefono")).contraseña(rs.getString("contraseña")).rol(rs.getString("rol")).build();
	}
	
	

}
