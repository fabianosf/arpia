package br.com.arpia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/produtoI")
	public String produto() {
		return "produto";
	}
	
	@GetMapping("/categoriaI")
	public String categoria() {
		return "categoria";
	}
	
	

}
