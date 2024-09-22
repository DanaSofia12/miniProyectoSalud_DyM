package com.sistemaSalud.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecetasDTO {
	
    private Long id;
    private Long idDoctor;
    private Long idPatient;
    private String namePatient;
    private LocalDateTime dateEmission;

}
