package br.com.johabfreitas.ediaristas.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.johabfreitas.ediaristas.core.enums.Icone;
import br.com.johabfreitas.ediaristas.core.repositories.ServicoRepository;
import br.com.johabfreitas.ediaristas.web.dtos.ServicoForm;
import br.com.johabfreitas.ediaristas.web.mappers.WebServicoMapper;

@Controller
@RequestMapping("/admin/servicos")
public class ServicoController {

	@Autowired
	private ServicoRepository repository;
	
	@Autowired
	private WebServicoMapper mapper;

	@GetMapping
	public ModelAndView buscarTodos() {
		var modelAndView = new ModelAndView("admin/servico/lista");

		modelAndView.addObject("servicos", repository.findAll());

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		var modelAndView = new ModelAndView("admin/servico/form");

		modelAndView.addObject("form", new ServicoForm());

		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public String cadastrar(ServicoForm form) {
		var servico = mapper.toModel(form);
		repository.save(servico);

		return "redirect:/admin/servicos";
	}
	
	@GetMapping("/{id}/editar")
	public ModelAndView aditar(@PathVariable Long id) {
		var modelAndView = new ModelAndView("admin/servico/form");
		
		var servico = repository.getReferenceById(id);
		var form  = mapper.toForm(servico);
		
		modelAndView.addObject("form", form);
		
		return modelAndView;
	}
	
	@PostMapping("/{id}/editar")
	public String editar(@PathVariable Long id, ServicoForm form) {
		var servico = mapper.toModel(form);
		servico.setId(id);
		
		repository.save(servico);
		
		return "redirect:/admin/servicos";
	}

	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id) {
		repository.deleteById(id);

		return "redirect:/admin/servicos";

	}

	@ModelAttribute("icones")
	public Icone[] getIcones() {
		return Icone.values();
	}

}
