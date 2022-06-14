package br.com.emprestimo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.emprestimo.model.Solicitacao;


@Repository
public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Date> {

	public List<Solicitacao> findAllByDataContainingIgnoreCase(Date data);
}
