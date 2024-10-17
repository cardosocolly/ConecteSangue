package br.ifsul.ConecteSangue.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TipoSangueRequest(
		@NotNull @NotBlank
		String tipoSangue
		) {

}
