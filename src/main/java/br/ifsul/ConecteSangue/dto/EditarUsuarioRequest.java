package br.ifsul.ConecteSangue.dto;

import jakarta.validation.constraints.Email;

public record EditarUsuarioRequest(
		String nome, 
		@Email
		String email,
		String senha,
		String tipoSangueUsuario
		
		) {

}
