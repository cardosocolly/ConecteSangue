package br.ifsul.ConecteSangue.dto;

public record CadastrarEnderecoRequest(
		String UF,
		String cidade,
		String bairro,
		String numero
		
		) {

}
