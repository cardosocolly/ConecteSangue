package br.ifsul.ConecteSangue.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Informacao {

	// atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String linkPost; 
	private String urlImagem; 
	private String descricao;
	
	// relacionamentos
	
	@ManyToMany(mappedBy = "informacoes")
    private List<Usuario> usuarios = new ArrayList<>();
	
	// construtores 
	
	public Informacao() {
		super();
		
	}

	public Informacao(Integer id, String linkPost, String urlImagem, String descricao) {
		super();
		this.id = id;
		this.linkPost = linkPost;
		this.urlImagem = urlImagem;
		this.descricao = descricao;
	}

	//getters and setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLinkPost() {
		return linkPost;
	}

	public void setLinkPost(String linkPost) {
		this.linkPost = linkPost;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	} 
	
}
