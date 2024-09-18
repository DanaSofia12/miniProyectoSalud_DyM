package com.sistemaSalud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaSalud.dto.MedicamentosDTO;
import com.sistemaSalud.response.ResponseHandler;
import com.sistemaSalud.service.MedicamentosService;
import com.sistemaSalud.utils.Utilities;

@RestController
@RequestMapping("/medicamentos")
@CrossOrigin(origins = "*")
public class MedicamentosController {
	
	@Autowired
	MedicamentosService medicamentosService;
	
	@PostMapping("/registrar")
	private ResponseEntity<Object> saveMedicamentos(@RequestBody MedicamentosDTO medicamentosDTO){
		return medicamentosService.saveMedicamentos(medicamentosDTO) == 1
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_REGISTER
						, HttpStatus.OK, null)
				: ResponseHandler.generateResponseError(Utilities.MESSAGE_NO_REGISTER, HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/consultar")
	private ResponseEntity<Object> getAllMedicamentos(){
		return ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_ALL_FOUND, HttpStatus.OK, medicamentosService.getAllMedicamentos());
	}
	
	@GetMapping("/consultar/{id}")
	private ResponseEntity<Object> getMedicamentoById(@PathVariable Long id){
		MedicamentosDTO medicamentosDTO = medicamentosService.getMedicamentoById(id);
		return medicamentosDTO != null
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_RECORDS, HttpStatus.OK, medicamentosDTO)
						:ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_NO_RECORDS, HttpStatus.OK, null);
	}
	
	@PutMapping("/actualizar")
	private ResponseEntity<Object> updateMedicamentos(@RequestBody MedicamentosDTO medicamentosDTO){
		return medicamentosService.updateMedicamentos(medicamentosDTO) == 1
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_UPDATE,
						HttpStatus.OK, null)
				: ResponseHandler.generateResponseError(Utilities.MESSAGE_NOT_UPDATE, HttpStatus.BAD_REQUEST);
						
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<Object> deleteMedicamentos(@PathVariable Integer id){
		return medicamentosService.deleteMedicamentos(id) == 1
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_DELETE,
						HttpStatus.OK, null)
				: ResponseHandler.generateResponseError(Utilities.MESSAGE_NO_DELETE, HttpStatus.BAD_REQUEST);
	}
	
	

}
