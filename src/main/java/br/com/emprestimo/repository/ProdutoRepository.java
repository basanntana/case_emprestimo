package br.com.emprestimo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.emprestimo.model.Produto;

//comunicacao com bd
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByProdutoContainingIgnoreCase(String emprestimo);
	                     //busca
	
}
