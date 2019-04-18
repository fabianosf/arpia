package br.com.arpia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.arpia.model.Produto;
import br.com.arpia.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> findAll(){
		return produtoRepository.findAll();
	}
	
	public Produto findOne(Long id) {
		return produtoRepository.findOne(id);
	}
	
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public void delete(Long id) {
		produtoRepository.delete(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
