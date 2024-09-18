package com.sistemaSalud.repository;

import java.util.List;

import com.sistemaSalud.model.Medicamentos;

public interface MedicamentosRepository {

	int saveMedicamentos(Medicamentos medicamentos);

	List<Medicamentos> getAllMedicamentos();

	Medicamentos getMedicamentoById(Long id);

	int updateMedicamentos(Medicamentos medicamentos);

	int deleteMunicipio(Integer id);


}
