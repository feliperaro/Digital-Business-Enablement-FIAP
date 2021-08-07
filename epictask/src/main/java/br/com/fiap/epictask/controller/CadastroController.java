package br.com.fiap.epictask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {

	@RequestMapping("/cadastro")
	public String index() {
		return "cadastro";
	}
}
