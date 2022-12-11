package br.com.johabfreitas.ediaristas.web.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.johabfreitas.ediaristas.core.models.Usuario;
import br.com.johabfreitas.ediaristas.web.dtos.UsuarioCadastroForm;
import br.com.johabfreitas.ediaristas.web.dtos.UsuarioEdicaoForm;

@Mapper(componentModel = "spring")
public interface WebUsuarioMapper {
	
	WebUsuarioMapper INSTANCE = Mappers.getMapper(WebUsuarioMapper.class);
	
	Usuario toModel(UsuarioCadastroForm form);
	
	Usuario toModel(UsuarioEdicaoForm form);
	
	UsuarioEdicaoForm toForm(Usuario model);

}
