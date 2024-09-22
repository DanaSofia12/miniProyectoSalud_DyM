package com.sistemaSalud.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecetaMedicamento {
	
    private Long id;
    private Long idReceta;
    private Long idMedicamento;
    private int cantidad;

}
