package com.example.demo.service;

import com.example.demo.entity.Usuario;

public interface UsuarioService {
	
	public Usuario save(Usuario u);
	public String login(String user , String ctr);
	

}
