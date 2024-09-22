package com.sistemaSalud.mapper;

import com.sistemaSalud.dto.RecetasDTO;
import com.sistemaSalud.model.Recetas;

public class RecetasMapper {
	
	public static Recetas toRecetas(RecetasDTO recetasDTO) {
		
		if (recetasDTO == null) {
			return null;
		} else {
			return Recetas.builder().id(recetasDTO.getId()).idMedico(recetasDTO.getIdDoctor()).idPaciente(recetasDTO.getIdPatient()).nombrePaciente(recetasDTO.getNamePatient()).fechaEmision(recetasDTO.getDateEmission()).build();
		}
	}

}
