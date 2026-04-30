package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Estudiante;
import com.example.demo.repository.EstudianteRepository;

@Service
public class EstudianteServiceImple implements EstudianteService {
	
	@Autowired
	EstudianteRepository estudianteRepository;

	@Override
	public Optional<Estudiante> findById(Integer id) {
		// TODO Auto-generated method stub
		return estudianteRepository.findById(id);
	}

	@Override
	public List<Estudiante> findAll() {
		// TODO Auto-generated method stub
		return estudianteRepository.findAll();
	}

	@Override
	public Estudiante save(Estudiante e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		estudianteRepository.deleteById(id);
		
	}

}
