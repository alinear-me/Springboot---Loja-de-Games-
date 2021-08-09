package LojaGames.CRUD.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //indica que essa classe será uma entidade do JPA hibernate
@Table(name = "categoria") // criando uma tabela com esse nome
public class Categoria {

	@Id //indica que é do tipo id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //no db será a pk
	private Long id;
	
	@NotNull
	@Size(min = 5, max = 50)
	private String genero; //tipo de categoria/genero, se é ação, rpg, etc...
	
	@NotNull
	@Size(min = 10, max = 100)
	private String tituloGame; // nome dos games 
	
	@NotNull
	@Size(min = 5, max = 20)
	private String classificacao; //idade mínima permitida 

	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTituloGame() {
		return tituloGame;
	}

	public void setTituloGame(String tituloGame) {
		this.tituloGame = tituloGame;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	
	

}
