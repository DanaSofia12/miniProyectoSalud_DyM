package com.sistemaSalud.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sistemaSalud.model.Medicamentos;

public class MedicamentosRowMapper implements RowMapper<Medicamentos> {
	
	@Override
	public Medicamentos mapRow(ResultSet rs, int RowNum) throws SQLException{
		
		return Medicamentos.builder().id(rs.getLong("id")).nombre(rs.getString("nombre")).descripcion(rs.getString("descripcion")).cantidad(rs.getInt("cantidad")).precio(rs.getBigDecimal("precio")).registrado_por(rs.getInt("registrado_por")).fecha_registro(rs.getDate("fecha_registro")).fecha_modificacion(rs.getDate("fecha_modificacion")).estado(rs.getString("estado")).build();
	}
	
	

}
