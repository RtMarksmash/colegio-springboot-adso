package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuario;

@Service
public interface UsuarioService {
	
	public Usuario save(Usuario u);
	public String login(String user , String ctr);

}
