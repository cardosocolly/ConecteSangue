package br.ifsul.ConecteSangue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifsul.ConecteSangue.entities.Perguntas;

@Repository
public interface PerguntasRepository extends JpaRepository<Perguntas, Integer>{

}
