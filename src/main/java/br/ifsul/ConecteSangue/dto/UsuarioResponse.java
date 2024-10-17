package br.ifsul.ConecteSangue.dto;

import br.ifsul.ConecteSangue.entities.Usuario;

public record UsuarioResponse(
		Integer id,
		String nome,
		String email,
		String tipo_sangue
		) {
	
	public UsuarioResponse(Usuario u) {
		this(u.getId(), u.getNome(), u.getEmail(), u.getTipoSangueUsuario()); 
	}
	
	
	

}
