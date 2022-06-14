package br.com.emprestimo.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;





@Data
@Entity //entidade do JPA 
@Table(name = "tb_produto") //criação de tabela para mySQL
public class Produto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // chave primária
	private long id; 
	
	@NotNull
	@Size(min = 5, max = 100)
	private String emprestimo;


	
	

}
