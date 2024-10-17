package br.ifsul.ConecteSangue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifsul.ConecteSangue.entities.Informacao;

@Repository
public interface InformacaoRepository extends JpaRepository<Informacao, Integer> {

}
