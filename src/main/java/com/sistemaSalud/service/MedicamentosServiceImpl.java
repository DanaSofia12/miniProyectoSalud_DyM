package com.sistemaSalud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaSalud.dto.MedicamentosDTO;
import com.sistemaSalud.mapper.MedicamentosDTOMapper;
import com.sistemaSalud.mapper.MedicamentosMapper;
import com.sistemaSalud.repository.MedicamentosRepository;

@Service
public class MedicamentosServiceImpl implements MedicamentosService {
	
	@Autowired
	MedicamentosRepository medicamentosRepository;

	@Override
	public int saveMedicamentos(MedicamentosDTO medicamentosDTO) {
		return medicamentosRepository.saveMedicamentos(MedicamentosMapper.toMedicamentos(medicamentosDTO));
	}

	@Override
	public List<MedicamentosDTO> getAllMedicamentos() {
		return medicamentosRepository.getAllMedicamentos().stream().map(MedicamentosDTOMapper::toMedicamentosDTO).toList();
	}

	@Override
	public MedicamentosDTO getMedicamentoById(Long id) {
		return MedicamentosDTOMapper.toMedicamentosDTO(medicamentosRepository.getMedicamentoById(id));
	}

	@Override
	public int updateMedicamentos(MedicamentosDTO medicamentosDTO) {
		return medicamentosRepository.updateMedicamentos(MedicamentosMapper.toMedicamentos(medicamentosDTO));
	}

	@Override
	public int deleteMedicamentos(Integer id) {
		return medicamentosRepository.deleteMunicipio(id);
	}

}
