package LojaGames.CRUD.seguranca;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import LojaGames.CRUD.model.Usuario;
import LojaGames.CRUD.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	Optional<Usuario> user = userRepository.findByUsuario(username);
	user.orElseThrow(() -> new UsernameNotFoundException(username + " Not Found. "));
	
	return user.map(UserDetailsImpl::new).get();
		
	}
	
	
	
}
