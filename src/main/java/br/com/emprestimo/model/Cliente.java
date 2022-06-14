package br.com.emprestimo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data //substituicao dos getters and setters
@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // chave primária
	private long id;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String nome;
	
	@NotNull
	@Size(max = 11)
	@CPF
	private int cpf;
	
	@Column(name = "dt_nascimento")
	@JsonFormat(pattern = "dd-MM-yyyy")
	@Min(value = 1992)
	private LocalDate dataNascimento;
	
	@NotNull
	@Size(max = 2)
	private String uf;
	
	@NotNull
	@Size(max = 10)
	private double rendaMensal;

	
	
	
	

}
