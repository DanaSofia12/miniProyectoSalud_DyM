package com.sistemaSalud.service;

import java.util.List;

import com.sistemaSalud.dto.MedicamentosDTO;

public interface MedicamentosService {

	int saveMedicamentos(MedicamentosDTO medicamentosDTO);

	List<MedicamentosDTO> getAllMedicamentos();

	MedicamentosDTO getMedicamentoById(Long id);

	int updateMedicamentos(MedicamentosDTO medicamentosDTO);

	int deleteMedicamentos(Integer id);

}
