package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Atributo nome é obrigatório!")
	@Size(max = 100, message = "O Atributo nome deve ter no máximo 100 caracteres!")
	private String nome;
	
	@NotBlank(message = "O Atributo descrição é obrigatório!") 
	@Size(min = 10, max = 1000, message = "O Atributo descrição deve ter no mínimo 10 caracteres e no máximo 1000 caracteres!")
	private String descricao;
	
	@NotBlank(message = "O Atributo console é obrigatório!")
	@Size(min = 5, max = 100, message = "O Atributo console deve ter no mínimo 05 caracteres e no máximo 100 caracteres!")
	private String console;
	
	@NotNull(message = "O Atributo quantidade é obrigatório!")
	private int quantidade;
	
	@Temporal(value = TemporalType.DATE)
	private LocalDate dataLancamento;
	
	@NotNull(message = "O Atributo preço é obrigatório!")
	@Digits(integer = 5, fraction = 2)
	private BigDecimal preco;
	
	@Size(max = 500, message = "O link da foto não pode ser maior do que 500 caracteres!")
	private String foto;
	
	private Long curtir;
	
	/* Relacionamento   */
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Long getCurtir() {
		return curtir;
	}

	public void setCurtir(Long curtir) {
		this.curtir = curtir;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
