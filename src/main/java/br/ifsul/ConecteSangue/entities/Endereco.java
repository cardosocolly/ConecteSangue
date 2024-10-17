package br.ifsul.ConecteSangue.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class Endereco {

	// atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String UF; 
	private String cidade; 
	private String bairro;
	private Integer numero;
	
	// relacionamentos
	
	@OneToMany(mappedBy = "endereco")
	private List<Usuario> usuarios = new ArrayList<>();
	
	@OneToMany(mappedBy = "endereco")
	private List<Hemocentro> hemocentros = new ArrayList<>();
	
	
	// construtores
	
	public Endereco() {
		super();
	}

	public Endereco(Integer id, String uF, String cidade, String bairro, Integer numero) {
		super();
		this.id = id;
		UF = uF;
		this.cidade = cidade;
		this.bairro = bairro;
		this.numero = numero;
	}

	// getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Hemocentro> getHemocentros() {
		return hemocentros;
	}

	public void setHemocentros(List<Hemocentro> hemocentros) {
		this.hemocentros = hemocentros;
	} 
	
	
	
}
