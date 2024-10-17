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
import jakarta.persistence.ManyToOne;


@Entity
public class Usuario {
	
	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	private String nome; 
	private String email; 
	private String senha; 
	private Date dataNasc; 
	private String cpf; 
	private String confEmail; 
	private String tipoSangueUsuario;
	private Boolean permiteNotificacaoEmail;
	private Boolean registroDoador;
	
	// relacinamentos
	
	@ManyToOne
	@JoinColumn(name = "id_endereco")
	private Endereco endereco; 
	
	@ManyToOne
	@JoinColumn(name = "id_triagem")
	private Triagem triagem; 
	
	 @ManyToMany
	    @JoinTable(
	        name = "usuario_informacao", // nome da tabela de junção
	        joinColumns = @JoinColumn(name = "usuario_id"), // chave estrangeira que referencia "Usuario"
	        inverseJoinColumns = @JoinColumn(name = "informacao_id") // chave estrangeira que referencia "Informacao"
	    )
	    private List<Informacao> informacoes = new ArrayList<>();
	 
	 @ManyToMany
	    @JoinTable(
	        name = "usuario_doacao", // nome da tabela de junção
	        joinColumns = @JoinColumn(name = "usuario_id"), // chave estrangeira que referencia "Usuario"
	        inverseJoinColumns = @JoinColumn(name = "doacao_id") // chave estrangeira que referencia "Doacao"
	    )
	    private List<Doacao> doacoes = new ArrayList<>();

	
	// construtores
	 
	public Usuario() {
		super();
		
	}

	public Usuario(Integer id, String nome, String email, String senha, Date dataNasc, String cpf, String confEmail,
			String tipoSangueUsuario, Boolean permiteNotificacaoEmail, Boolean registroDoador) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
		this.confEmail = confEmail;
		this.tipoSangueUsuario = tipoSangueUsuario;
		this.permiteNotificacaoEmail = permiteNotificacaoEmail;
		this.registroDoador = registroDoador;
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
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
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
	
	public String getTipoSangueUsuario() {
		return tipoSangueUsuario;
	}
	
	public void setTipoSangueUsuario(String tipoSangueUsuario) {
		this.tipoSangueUsuario = tipoSangueUsuario;
	}
	
	public Boolean getPermiteNotificacaoEmail() {
		return permiteNotificacaoEmail;
	}
	
	public void setPermiteNotificacaoEmail(Boolean permiteNotificacaoEmail) {
		this.permiteNotificacaoEmail = permiteNotificacaoEmail;
	}
	
	public Boolean getRegistroDoador() {
		return registroDoador;
	}
	
	public void setRegistroDoador(Boolean registroDoador) {
		this.registroDoador = registroDoador;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Triagem getTriagem() {
		return triagem;
	}

	public void setTriagem(Triagem triagem) {
		this.triagem = triagem;
	}

	public List<Informacao> getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(List<Informacao> informacoes) {
		this.informacoes = informacoes;
	}

	public List<Doacao> getDoacoes() {
		return doacoes;
	}

	public void setDoacoes(List<Doacao> doacoes) {
		this.doacoes = doacoes;
	} 
}

