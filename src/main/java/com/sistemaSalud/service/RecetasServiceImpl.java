package com.sistemaSalud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaSalud.dto.RecetasDTO;
import com.sistemaSalud.mapper.RecetasMapper;
import com.sistemaSalud.repository.RecetasRepository;

@Service
public class RecetasServiceImpl implements RecetasService{
	
	@Autowired
	RecetasRepository recetasRepository;

	@Override
	public int createReceta(RecetasDTO recetasDTO) {
		return recetasRepository.createReceta(RecetasMapper.toRecetas(recetasDTO));
	}

}
