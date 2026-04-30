package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Estudiante;

@Service
public interface EstudianteService {
	public Optional<Estudiante>findById(Integer id);
	public List<Estudiante>findAll();
	public Estudiante save(Estudiante e);
	public void deleteById(Integer id);

}
