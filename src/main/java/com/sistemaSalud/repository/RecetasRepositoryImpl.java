package com.sistemaSalud.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sistemaSalud.model.Recetas;

@Repository
public class RecetasRepositoryImpl implements RecetasRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int createReceta(Recetas recetas) {

		StringBuilder query = new StringBuilder();
		query.append("INSERT INTO recetas")
				.append("(id, id_medico, id_paciente, nombre_paciente, fecha_emision)")
				.append("VALUES (?,?,?,?,?)");
		
		Object[] params = { recetas.getId(), recetas.getIdMedico(), recetas.getIdPaciente(), recetas.getNombrePaciente(), recetas.getFechaEmision()};
		
		return jdbcTemplate.update(query.toString(), params);
	}

}
