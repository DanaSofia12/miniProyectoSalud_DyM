package com.sistemaSalud.mapper;

import com.sistemaSalud.dto.RecetasDTO;
import com.sistemaSalud.model.Recetas;

public class RecetasDTOMapper {
	
	public static RecetasDTO toRecetasDTO(Recetas recetas) {
		
		if(recetas == null) {
			return null;
		}else {
			return RecetasDTO.builder().id(recetas.getId()).idDoctor(recetas.getIdMedico()).idPatient(recetas.getIdPaciente()).namePatient(recetas.getNombrePaciente()).dateEmission(recetas.getFechaEmision()).build();
		}
	}

}
