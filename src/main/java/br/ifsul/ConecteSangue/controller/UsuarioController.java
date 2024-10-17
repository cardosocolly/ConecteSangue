package br.ifsul.ConecteSangue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ifsul.ConecteSangue.dto.CadastrarUsuarioRequest;
import br.ifsul.ConecteSangue.dto.TipoSangueRequest;
import br.ifsul.ConecteSangue.dto.UsuarioResponse;
import br.ifsul.ConecteSangue.entities.Usuario;
import br.ifsul.ConecteSangue.services.UsuarioService;
import jakarta.validation.Valid;
import lombok.var;


@RestController 
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service; 
	
	 
	@PostMapping()
	public UsuarioResponse cadastrarUsuario(@RequestBody @Valid CadastrarUsuarioRequest dados) {
		
		var response = service.cadastrarUsuario(dados);
		
		return response; 
	}
	
	@GetMapping
	public List<UsuarioResponse> listarUsuarios() {
		
		var response = service.listarUsuarios(); 
		
		return response;
	}
	
	@GetMapping("/{id}")
	public UsuarioResponse listarID(@PathVariable Integer id) {
		
		var response = service.listarID(id); 
		
		return response;
	}
	
	@PutMapping("/{id}")
	public UsuarioResponse editarUsuario(@PathVariable Integer id, @RequestBody CadastrarUsuarioRequest dados) {
		
		var usuario = service.editarUsuario(id, dados);
		
		return usuario; 
	}

	@DeleteMapping("/{id}")
	public String excluirUsuario(@PathVariable Integer id) {
		
		var response = service.excluirUsuario(id); 
		
		return response; 
	}

	@GetMapping("/tipoSangue")
	public List<UsuarioResponse> listarSangue(@RequestBody @Valid TipoSangueRequest dados) {
		
		var response = service.listarSangue(dados);
		
		return response; 
		
	}
	

}
