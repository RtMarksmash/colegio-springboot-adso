package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;

@Service
public class UsuarioServiceImple implements UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario save(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(u);
	}

	@Override
	public String login(String user, String ctr) {
		// TODO Auto-generated method stub
		
		Usuario usuario = usuarioRepository.findByUsername(user);
		
		if(usuario==null  ) {
			
			return "usuario no encontrado";
			
		}
		
		if(!usuario.getPassword().equals(ctr)) {
			
			return "contraseña no coincide";
		}
		
		return "inicio exitoso te haz logueado";
	}
	

}
