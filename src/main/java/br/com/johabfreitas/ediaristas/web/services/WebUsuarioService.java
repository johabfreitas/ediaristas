package br.com.johabfreitas.ediaristas.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.johabfreitas.ediaristas.core.models.Usuario;
import br.com.johabfreitas.ediaristas.core.repositories.UsuarioRepository;

@Service
public class WebUsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> buscarTodos(){
		return repository.findAll();
	}

}
