package com.sistemaSalud.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Recetas {
	
    private Long id;
    private Long idMedico;
    private Long idPaciente;
    private String nombrePaciente;
    private LocalDateTime fechaEmision;

}
