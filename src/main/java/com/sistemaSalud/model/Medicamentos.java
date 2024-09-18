package com.sistemaSalud.model;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Medicamentos {
	
	private Long id;
	private String nombre;
	private String descripcion;
	private Integer cantidad;
	private BigDecimal precio;
	private Integer registrado_por;
	private Date fecha_registro;
	private Date fecha_modificacion;
	private String estado;
	

}
