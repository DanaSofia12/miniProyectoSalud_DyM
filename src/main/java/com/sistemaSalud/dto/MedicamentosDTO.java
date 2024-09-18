package com.sistemaSalud.dto;

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
public class MedicamentosDTO {
	
	private Long id;
	private String name;
	private String description;
	private Integer amount;
	private BigDecimal price;
	private Integer register_for;
	private Date date_register;
	private Date date_modification;
	private String status;

}
