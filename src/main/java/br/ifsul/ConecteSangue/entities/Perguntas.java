package br.ifsul.ConecteSangue.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Perguntas {

	// atributos 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String pergunta; 
	private String resposta;
	
	// relacionamentos
	
	@ManyToMany(mappedBy = "perguntas")
    private List<Triagem> triagens = new ArrayList<>();
	
	// construtores 
	
	public Perguntas() {
		super();
	
	}

	public Perguntas(Integer id, String pergunta, String resposta) {
		super();
		this.id = id;
		this.pergunta = pergunta;
		this.resposta = resposta;
	}
	
	// getters and setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public List<Triagem> getTriagens() {
		return triagens;
	}

	public void setTriagens(List<Triagem> triagens) {
		this.triagens = triagens;
	} 
}
