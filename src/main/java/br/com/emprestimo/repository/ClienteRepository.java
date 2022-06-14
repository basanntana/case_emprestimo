package br.com.emprestimo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.emprestimo.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	public Optional<Cliente>  findByCliente(String nome);
	
	public Cliente findByCpf(int cpf);
	
	public Cliente findByIdade(int idade);
	
	public Cliente findByUf(String uf);
	
	public Cliente findByRenda_mensal(int renda_mensal);
	

}