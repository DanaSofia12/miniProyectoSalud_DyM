package com.sistemaSalud.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sistemaSalud.model.Recetas;


public class RecetasRowMapper implements RowMapper<Recetas> {
	
	@Override
	public Recetas mapRow(ResultSet rs, int RowNum) throws SQLException{
		
		return Recetas.builder().id(rs.getLong("id")).idMedico(rs.getLong("id_medico")).idPaciente(rs.getLong("id_paciente")).nombrePaciente(rs.getString("nombre_paciente")).fechaEmision(rs.getTimestamp("fecha_emision").toLocalDateTime()).build();
	}

}
