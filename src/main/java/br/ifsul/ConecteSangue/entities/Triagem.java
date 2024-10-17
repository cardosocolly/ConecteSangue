package br.ifsul.ConecteSangue.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Triagem {

	// atributos 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private Date dataTriagem; 
	private Boolean resultado;
	
	// relacionamentos
	
	@OneToMany(mappedBy = "triagem")
	private List<Usuario> usuarios = new ArrayList<>();
	
	 @ManyToMany
	    @JoinTable(
	        name = "triagem_perguntas", // nome da tabela de junção
	        joinColumns = @JoinColumn(name = "triagem_id"), // chave estrangeira que referencia "Triagem"
	        inverseJoinColumns = @JoinColumn(name = "perguntas_id") // chave estrangeira que referencia "Perguntas"
	    )
	    private List<Perguntas> perguntas = new ArrayList<>();
	
	// construtores 
	
	public Triagem() {
		super();
	} 
	
	public Triagem(Integer id, Date dataTriagem, Boolean resultado) {
		super();
		this.id = id;
		this.dataTriagem = dataTriagem;
		this.resultado = resultado;
	}


	// getters and setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataTriagem() {
		return dataTriagem;
	}

	public void setDataTriagem(Date dataTriagem) {
		this.dataTriagem = dataTriagem;
	}

	public Boolean getResultado() {
		return resultado;
	}

	public void setResultado(Boolean resultado) {
		this.resultado = resultado;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Perguntas> getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(List<Perguntas> perguntas) {
		this.perguntas = perguntas;
	}
	
}
