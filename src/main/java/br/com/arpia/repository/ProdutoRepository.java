package br.com.arpia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.arpia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
