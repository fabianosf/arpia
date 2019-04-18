package br.com.arpia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.arpia.model.Categoria;
import br.com.arpia.service.CategoriaService;

@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	 	
	 
	
	@GetMapping("/categoria")
	public ModelAndView findAll() {		
		ModelAndView mv = new ModelAndView("/categoria");
		mv.addObject("categorias", categoriaService.findAll());		
		return mv;
	}
	
	@GetMapping("/addc")
	public ModelAndView add(Categoria categoria) {		
		ModelAndView mv = new ModelAndView("/categoriaAdd");
		mv.addObject("Categoria", categoria);		
		return mv;
	}
	
	@GetMapping("/editc/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {		
		return add(categoriaService.findOne(id));
	}
	
	@GetMapping("/deletec/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {		
		categoriaService.delete(id);		
		return findAll();
	}
	
	@PostMapping("/savec")
	public ModelAndView save(@Valid Categoria categoria, BindingResult result) {		
		if(result.hasErrors()) {
			return add(categoria);
		}		
		categoriaService.save(categoria);		
		return findAll();
	}
	
	 
	 
	
	
	
	

}
