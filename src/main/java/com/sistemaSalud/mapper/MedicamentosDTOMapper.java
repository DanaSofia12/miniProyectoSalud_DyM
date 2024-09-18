package com.sistemaSalud.mapper;

import com.sistemaSalud.dto.MedicamentosDTO;
import com.sistemaSalud.model.Medicamentos;

public class MedicamentosDTOMapper {
	
	public static MedicamentosDTO toMedicamentosDTO(Medicamentos medicamentos) {
		
		if(medicamentos == null) {
			return null;
		}else {
			return MedicamentosDTO.builder().id(medicamentos.getId()).name(medicamentos.getNombre()).description(medicamentos.getDescripcion()).amount(medicamentos.getCantidad()).price(medicamentos.getPrecio()).register_for(medicamentos.getRegistrado_por()).date_register(medicamentos.getFecha_registro()).date_modification(medicamentos.getFecha_modificacion()).status(medicamentos.getEstado()).build();
		}
	}

}
