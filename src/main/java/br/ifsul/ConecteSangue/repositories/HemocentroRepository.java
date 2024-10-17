package br.ifsul.ConecteSangue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifsul.ConecteSangue.entities.Hemocentro;

@Repository
public interface HemocentroRepository extends JpaRepository<Hemocentro, Integer> {

}
