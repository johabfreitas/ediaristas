package br.com.johabfreitas.ediaristas.web.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.johabfreitas.ediaristas.core.models.Servico;
import br.com.johabfreitas.ediaristas.web.dtos.ServicoForm;

@Mapper(componentModel = "spring")
public interface WebServicoMapper {

	WebServicoMapper INSTANCE = Mappers.getMapper(WebServicoMapper.class);

	public Servico toModel(ServicoForm form);

	public ServicoForm toForm(Servico model);

}
