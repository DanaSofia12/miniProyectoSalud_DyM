package com.sistemaSalud.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sistemaSalud.mapper.MedicamentosRowMapper;
import com.sistemaSalud.model.Medicamentos;

@Repository
public class MedicamentosRepositoryImpl implements MedicamentosRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int saveMedicamentos(Medicamentos medicamentos) {
		StringBuilder query = new StringBuilder();
		query.append("INSERT INTO medicamentos")
				.append("(id, nombre, descripcion, cantidad, precio, registrado_por, fecha_registro, fecha_modificacion, estado)")
				.append("VALUES (?,?,?,?,?,?,?,?,?)");
		
		Object[] params = { medicamentos.getId(), medicamentos.getNombre(), medicamentos.getDescripcion(), medicamentos.getCantidad(), medicamentos.getPrecio(), medicamentos.getRegistrado_por(), medicamentos.getFecha_registro(), medicamentos.getFecha_modificacion(), medicamentos.getEstado() };
		
		return jdbcTemplate.update(query.toString(), params);
	}

	@Override
	public List<Medicamentos> getAllMedicamentos() {
		StringBuilder query = new StringBuilder();
		query.append("SELECT * FROM medicamentos");
		
		return jdbcTemplate.query(query.toString(), new MedicamentosRowMapper());
	}

	@Override
	public Medicamentos getMedicamentoById(Long id) {
		
		try {
		StringBuilder query = new StringBuilder();
		query.append("SELECT * ")
				.append(" FROM medicamentos")
				.append(" WHERE id = ?");
		return jdbcTemplate.queryForObject(query.toString(), new MedicamentosRowMapper(), id);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public int updateMedicamentos(Medicamentos medicamentos) {
		StringBuilder query = new StringBuilder();
		query.append("UPDATE medicamentos ")
				.append(" SET nombre=?, descripcion=?, cantidad=?, precio=?, fecha_modificacion=?, estado=?  ")
				.append("WHERE id=?");
		
		Object[] params = { medicamentos.getNombre(), medicamentos.getDescripcion(), medicamentos.getCantidad(), medicamentos.getPrecio(), medicamentos.getFecha_modificacion(), medicamentos.getEstado(), medicamentos.getId() };
		
		return jdbcTemplate.update(query.toString(), params);
	}

	@Override
	public int deleteMunicipio(Integer id) {
		String query = "DELETE FROM medicamentos WHERE id=?";
		return jdbcTemplate.update(query, id);
	}
	
	}


