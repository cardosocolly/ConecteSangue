package br.ifsul.ConecteSangue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifsul.ConecteSangue.entities.Triagem;

@Repository
public interface TriagemRepository extends JpaRepository<Triagem, Integer> {

}
