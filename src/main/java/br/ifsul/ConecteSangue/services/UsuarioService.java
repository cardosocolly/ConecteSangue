package br.ifsul.ConecteSangue.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.ifsul.ConecteSangue.dto.CadastrarUsuarioRequest;
import br.ifsul.ConecteSangue.dto.TipoSangueRequest;
import br.ifsul.ConecteSangue.dto.UsuarioResponse;
import br.ifsul.ConecteSangue.entities.Usuario;
import br.ifsul.ConecteSangue.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public UsuarioResponse cadastrarUsuario(CadastrarUsuarioRequest dados) {

		Usuario u = new Usuario();
		u.setNome(dados.nome());
		u.setEmail(dados.email());
		u.setSenha(dados.senha());
		u.setTipoSangueUsuario(dados.tipoSangueUsuario());

		repository.save(u);

		return new UsuarioResponse(u);

	}

	public List<UsuarioResponse> listarUsuarios() {

		var response = repository.findAll();

		return response.stream() // separa em pedacinhos a lista de usuarios
				.map(UsuarioResponse::new) // entra em cada pedacinho
				.collect(Collectors.toList()); // transforma em uma lista
	}

	public UsuarioResponse listarID(Integer id) {

		var response = repository.getReferenceById(id);

		return new UsuarioResponse(response);

	}
	
	public UsuarioResponse editarUsuario(Integer id, CadastrarUsuarioRequest dados) {
		
		var usuario = repository.getReferenceById(id);
		
		if(!dados.nome().isEmpty()) {
			usuario.setNome(dados.nome());
		}
		
		if(!dados.email().isEmpty()) {
			usuario.setEmail(dados.email());
		}
		
		if(!dados.senha().isEmpty()) {
			usuario.setSenha(dados.senha());
		}
		
		if(!dados.tipoSangueUsuario().isEmpty()) {
			usuario.setTipoSangueUsuario(dados.tipoSangueUsuario());
		}
		
		repository.save(usuario); 
		
		return new UsuarioResponse(usuario);
	}
	
	public String excluirUsuario(Integer id) {
		
		var usuario = repository.getReferenceById(id);
		
		repository.delete(usuario);
		
		return "Usuario deletado"; 
	}
	
	public List<UsuarioResponse> listarSangue(TipoSangueRequest dados) {
		
		var usuario = repository.findByTipoSangueUsuario(dados.tipoSangue());

		return usuario.stream() // separa em pedacinhos a lista de usuarios
				.map(UsuarioResponse::new) // entra em cada pedacinho
				.collect(Collectors.toList()); // transforma em uma lista
	}

	
}
