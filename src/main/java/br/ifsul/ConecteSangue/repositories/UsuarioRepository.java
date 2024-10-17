package br.ifsul.ConecteSangue.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifsul.ConecteSangue.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	List<Usuario> findByTipoSangueUsuario(String tipoSangue);

}
