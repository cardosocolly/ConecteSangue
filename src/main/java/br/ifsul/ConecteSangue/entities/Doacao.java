package br.ifsul.ConecteSangue.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Doacao {

	// atributos 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String tipoSangueSolicitado;
	private String local; 
	private Date dataNasc;
	private String cpf; 
	private String confEmail;
	
	// relacionamentos
	
	@ManyToMany(mappedBy = "doacoes")
    private List<Usuario> usuarios = new ArrayList<>();
	
	// construtores
	
	public Doacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doacao(Integer id, String tipoSangueSolicitado, String local, Date dataNasc, String cpf, String confEmail) {
		super();
		this.id = id;
		this.tipoSangueSolicitado = tipoSangueSolicitado;
		this.local = local;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.confEmail = confEmail;
	}
	
	// getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoSangueSolicitado() {
		return tipoSangueSolicitado;
	}

	public void setTipoSangueSolicitado(String tipoSangueSolicitado) {
		this.tipoSangueSolicitado = tipoSangueSolicitado;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getConfEmail() {
		return confEmail;
	}

	public void setConfEmail(String confEmail) {
		this.confEmail = confEmail;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	} 
}
