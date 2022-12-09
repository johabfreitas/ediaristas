package br.com.johabfreitas.ediaristas.web.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.johabfreitas.ediaristas.core.models.Usuario;
import br.com.johabfreitas.ediaristas.web.dtos.UsuarioCadastroForm;

@Mapper(componentModel = "spring")
public interface WebUsuarioMapper {
	
	WebUsuarioMapper INSTANCE = Mappers.getMapper(WebUsuarioMapper.class);
	
	Usuario toModel(UsuarioCadastroForm form);

}
