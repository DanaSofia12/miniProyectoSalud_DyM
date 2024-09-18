package com.sistemaSalud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaSalud.dto.UsuarioDTO;
import com.sistemaSalud.mapper.UsuarioDTOMapper;
import com.sistemaSalud.mapper.UsuarioMapper;
import com.sistemaSalud.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public int saveUsuario(UsuarioDTO usuarioDTO) {
		return usuarioRepository.saveUsuario(UsuarioMapper.toUsuario(usuarioDTO));
	}

	@Override
	public List<UsuarioDTO> getAllUsuarios() {
		return usuarioRepository.getAllUsuarios().stream().map(UsuarioDTOMapper::toUsuarioDTO).toList();
	}

	@Override
	public UsuarioDTO getUsuarioById(Long id) {
		return UsuarioDTOMapper.toUsuarioDTO(usuarioRepository.getUsuarioById(id));
	}

	@Override
	public int updateUsuarios(UsuarioDTO usuarioDTO) {
		return usuarioRepository.updateUsuarios(UsuarioMapper.toUsuario(usuarioDTO));
	}

	@Override
	public int deleteUsuarios(Integer id) {
		return usuarioRepository.deleteUsuarios(id);
	}

}
