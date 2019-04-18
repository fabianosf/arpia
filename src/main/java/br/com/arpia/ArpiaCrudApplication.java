package br.com.arpia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.arpia.model.Categoria;
import br.com.arpia.model.Produto;
import br.com.arpia.repository.CategoriaRepository;
import br.com.arpia.repository.ProdutoRepository;

@SpringBootApplication
public class ArpiaCrudApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ArpiaCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria categoria = new Categoria();
		categoria.setNome("Alimentos");
		
		Produto produto = new Produto();
		produto.setNome("Arroz");
		produto.setPreco(10.50);
		List<Produto>produtos = new ArrayList<Produto>();
		produtos.add(produto);		
		produto.setCategoria(categoria);
		
		
//		categoriaRepository.save(categoria);
//		produtoRepository.save(produto);
		
		 
		
	}
	
	
	
	

}
