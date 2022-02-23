package br.com.festa.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity

public class Convidado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "increment") 
	@GenericGenerator( name = "increment", strategy = "increment")
	private Long id;
	
	private String nome;

	private Integer quantidadeAcompanhante;
	
	

	public Convidado() {
		
	}

	public Convidado(Long id, String nome, Integer quantidadeAcompanhante) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidadeAcompanhante = quantidadeAcompanhante;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeAcompanhante() {
		return quantidadeAcompanhante;
	}

	public void setQuantidadeAcompanhante(Integer quantidadeAcompanhante) {
		this.quantidadeAcompanhante = quantidadeAcompanhante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, quantidadeAcompanhante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(quantidadeAcompanhante, other.quantidadeAcompanhante);
	}

	@Override
	public String toString() {
		return "Convidado [id=" + id + ", nome=" + nome + ", quantidadeAcompanhante=" + quantidadeAcompanhante + "]";
	}
	
	

}
