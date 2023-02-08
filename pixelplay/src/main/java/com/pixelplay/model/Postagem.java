package com.pixelplay.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O Atributo título é Obrigatório!")
	@Size(min = 5, max = 100, message = "O Atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
	private String titulo;

	@NotBlank(message = "O Atributo texto é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O Atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String nome;

	@NotBlank(message = "O Atributo texto é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O Atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String categoria;

	@NotBlank(message = "O Atributo texto é Obrigatório!")
	@Size(min = 10, max = 1000, message = "O Atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String descricao;

	@NotBlank(message = "O Atributo texto é Obrigatório!")
	@Size(min = 1, max = 1000, message = "O Atributo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String idade;

	@ManyToOne
	@JsonIgnoreProperties("Postagem")
	private Tema tema;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}
