package com.sistemaSalud.mapper;

import com.sistemaSalud.dto.MedicamentosDTO;
import com.sistemaSalud.model.Medicamentos;

public class MedicamentosMapper {
	
	public static Medicamentos toMedicamentos(MedicamentosDTO medicamentosDTO) {
		
		if (medicamentosDTO == null) {
			return null;
		} else {
			return Medicamentos.builder().id(medicamentosDTO.getId()).nombre(medicamentosDTO.getName()).descripcion(medicamentosDTO.getDescription()).cantidad(medicamentosDTO.getAmount()).precio(medicamentosDTO.getPrice()).registrado_por(medicamentosDTO.getRegister_for()).fecha_registro(medicamentosDTO.getDate_register()).fecha_modificacion(medicamentosDTO.getDate_modification()).estado(medicamentosDTO.getStatus()).build();
		}
	}

}
