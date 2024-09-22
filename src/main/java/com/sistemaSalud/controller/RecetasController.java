package com.sistemaSalud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaSalud.dto.RecetasDTO;
import com.sistemaSalud.response.ResponseHandler;
import com.sistemaSalud.service.RecetasService;
import com.sistemaSalud.utils.Utilities;

@RestController
@RequestMapping("/recetar")
@CrossOrigin(origins = "*")
public class RecetasController {
	
	@Autowired
	RecetasService recetasService;
	
	@PostMapping("/crear")
	private ResponseEntity<Object> createReceta(@RequestBody RecetasDTO recetasDTO){
		return recetasService.createReceta(recetasDTO) == 1
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_REGISTER, 
						HttpStatus.OK, null)
				: ResponseHandler.generateResponseError(Utilities.MESSAGE_NO_REGISTER, HttpStatus.BAD_REQUEST);
	}
	

	
}
