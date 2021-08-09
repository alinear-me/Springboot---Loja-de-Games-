package LojaGames.CRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import LojaGames.CRUD.model.Categoria;

@Repository //anotação que diz que essa classe é um repositório
public interface CategoriaRepository extends JpaRepository<Categoria, Long> { //esta "Categoria" é o mesmo nome do model "Categoria"
	public List<Categoria> findAllByGeneroContainingIgnoreCase (String genero);
	
	
	 

}
