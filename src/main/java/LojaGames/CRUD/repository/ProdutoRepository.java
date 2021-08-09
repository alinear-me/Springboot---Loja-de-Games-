package LojaGames.CRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import LojaGames.CRUD.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
	
	
	
	
	

}
