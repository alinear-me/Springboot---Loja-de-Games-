package LojaGames.CRUD.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import LojaGames.CRUD.model.Usuario;

/* Este Usuario do nome do atributo é o mesmo Usuario que foi 
 * atributo da model. 
 * 
 * */

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario);
}
