package br.org.universa.frogbts.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bug implements Serializable {

	private static final long serialVersionUID = 1L;
	private String chave;
	private Date dataCriacao;
	private Date dataUltimaModificacao;
	private String descricao;
	private Long id;
	private String prioridade;
	private String status;

	public Bug() {
	}

	public Bug(Long id2) {
		this.id = id2;
	}

	public String getChave() {
		return chave;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public Date getDataUltimaModificacao() {
		return dataUltimaModificacao;
	}

	public String getDescricao() {
		return descricao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public String getStatus() {
		return status;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public void setDataUltimaModificacao(Date dataUltimaModificacao) {
		this.dataUltimaModificacao = dataUltimaModificacao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
