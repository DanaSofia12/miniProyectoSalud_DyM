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

import com.sistemaSalud.dto.UsuarioDTO;
import com.sistemaSalud.response.ResponseHandler;
import com.sistemaSalud.service.UsuarioService;
import com.sistemaSalud.utils.Utilities;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping("/registrar")
	private ResponseEntity<Object> saveUsuario(@RequestBody UsuarioDTO usuarioDTO){
		return usuarioService.saveUsuario(usuarioDTO) == 1
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_REGISTER, 
						HttpStatus.OK, null)
				: ResponseHandler.generateResponseError(Utilities.MESSAGE_NO_REGISTER, HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/consultar")
	private ResponseEntity<Object> getAllUsuarios(){
		return ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_ALL_FOUND, HttpStatus.OK, usuarioService.getAllUsuarios());
	}
	
	@GetMapping("/consultar/{id}")
	private ResponseEntity<Object> getUsuarioById(@PathVariable Long id){
		UsuarioDTO usuarioDTO = usuarioService.getUsuarioById(id);
		return usuarioDTO != null
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_RECORDS, HttpStatus.OK, usuarioDTO)
						:ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_NO_RECORDS, HttpStatus.OK, null);
	}
	
	@PutMapping("/actualizar")
	private ResponseEntity<Object> updateUsuarios(@RequestBody UsuarioDTO usuarioDTO){
		return usuarioService.updateUsuarios(usuarioDTO) == 1
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_UPDATE,
						HttpStatus.OK, null)
				: ResponseHandler.generateResponseError(Utilities.MESSAGE_NOT_UPDATE, HttpStatus.BAD_REQUEST);
						
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<Object> deleteUsuarios(@PathVariable Integer id){
		return usuarioService.deleteUsuarios(id) == 1
				? ResponseHandler.generateResponseSuccess(Utilities.MESSAGE_DELETE,
						HttpStatus.OK, null)
				: ResponseHandler.generateResponseError(Utilities.MESSAGE_NO_DELETE, HttpStatus.BAD_REQUEST);
	}
}
