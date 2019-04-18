package br.com.arpia.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.arpia.model.Categoria;
import br.com.arpia.model.Produto;
import br.com.arpia.service.CategoriaService;
import br.com.arpia.service.ProdutoService;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private CategoriaService categoriaService;
	
	 
	
	
	@GetMapping("/produto")
	public ModelAndView findAll() {		
		ModelAndView mv = new ModelAndView("/produto");
		mv.addObject("produtos", produtoService.findAll());
		
		return mv;
	}
	
	@GetMapping("/add")
	public ModelAndView add(Produto produto) {		
		ModelAndView mv = new ModelAndView("/produtoAdd");
		mv.addObject("produto", produto);		
		return mv;
	}
	
	@GetMapping("/edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {		
		return add(produtoService.findOne(id));
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {		
		produtoService.delete(id);		
		return findAll();
	}
	
	@PostMapping("/save")
	public ModelAndView save(@Valid Produto produto, BindingResult result) {		
		if(result.hasErrors()) {
			return add(produto);
		}		
		produtoService.save(produto);		
		return findAll();
	}
	
	
	 
	@ModelAttribute("categorias")
	public List<Categoria> listaDeCategorias() {
		return categoriaService.findAll();
	}	
	
	
	
	
	

}
