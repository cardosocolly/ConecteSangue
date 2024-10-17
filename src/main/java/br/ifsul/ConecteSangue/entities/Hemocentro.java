package br.ifsul.ConecteSangue.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Hemocentro {

	// atributos 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String nome;
	private String email; 
	private Integer telefone;
	private Integer telefone2;
	private Integer telefone3;
	private String latitude;
	private String longitude;
	
	// relacionamentos
	
	@ManyToOne
	@JoinColumn(name = "id_endereco")
	private Endereco endereco; 
	

	// construtores
	public Hemocentro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hemocentro(Integer id, String nome, String email, Integer telefone, Integer telefone2, Integer telefone3,
			String latitude, String longitude) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.telefone2 = telefone2;
		this.telefone3 = telefone3;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	// getters and setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(Integer telefone2) {
		this.telefone2 = telefone2;
	}

	public Integer getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(Integer telefone3) {
		this.telefone3 = telefone3;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	} 
	
	
}
