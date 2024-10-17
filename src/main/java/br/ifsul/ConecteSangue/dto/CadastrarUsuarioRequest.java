package br.ifsul.ConecteSangue.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CadastrarUsuarioRequest(
		@NotNull @NotBlank
		String nome, 
		@NotNull @NotBlank @Email 
		String email,
		@NotNull @NotBlank
		String senha,
		@NotNull @NotBlank
		String tipoSangueUsuario
		) {
}
