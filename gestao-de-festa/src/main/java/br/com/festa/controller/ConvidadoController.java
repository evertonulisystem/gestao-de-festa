package br.com.festa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.festa.model.Convidado;
import br.com.festa.repository.ConvidadoRepository;

@Controller //Para este teste nao pode ser RestController
@RequestMapping("/convidados")
public class ConvidadoController {
	
	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaConvidados"); //esse arquivo tem de ser igual ao do TEMPLATE
		modelAndView.addObject("convidados", convidadoRepository.findAll());
		modelAndView.addObject("convidado", new Convidado());
		return modelAndView;
		
	}
	@PostMapping
	public String salvar(Convidado convidado) {
		this.convidadoRepository.save(convidado);		
		return "redirect:/convidados";
	}	
	
	

}
