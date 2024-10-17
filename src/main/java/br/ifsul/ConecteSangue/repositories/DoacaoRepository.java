package br.ifsul.ConecteSangue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifsul.ConecteSangue.entities.Doacao;

@Repository
public interface DoacaoRepository extends JpaRepository<Doacao, Integer> {

}
