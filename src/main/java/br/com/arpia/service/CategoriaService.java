package br.com.arpia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.arpia.model.Categoria;
import br.com.arpia.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> findAll(){
		return categoriaRepository.findAll();
	}
	
	public Categoria findOne(Long id) {
		return categoriaRepository.findOne(id);
	}
	
	public Categoria save(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public void delete(Long id) {
		categoriaRepository.delete(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
