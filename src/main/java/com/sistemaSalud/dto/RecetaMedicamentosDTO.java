package com.sistemaSalud.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecetaMedicamentosDTO {
	
    private Long id;
    private Long idprescription;
    private Long idMedicine;
    private int amount;

}
