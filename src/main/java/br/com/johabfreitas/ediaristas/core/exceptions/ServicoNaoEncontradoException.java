package br.com.johabfreitas.ediaristas.core.exceptions;

import javax.persistence.EntityNotFoundException;

public class ServicoNaoEncontradoException extends EntityNotFoundException{
	
	private static final long serialVersionUID = 1L;

	public ServicoNaoEncontradoException(String message) {
		super(message);
	}

}
