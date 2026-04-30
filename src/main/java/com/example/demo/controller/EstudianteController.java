package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Estudiante;
import com.example.demo.service.EstudianteService;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {
	
	@Autowired
	EstudianteService estudianteService;
	
	 @GetMapping("/{id}")
	    public Optional<Estudiante> buscarPorId(@PathVariable Integer id) {
	        return estudianteService.findById(id);
	    }

	    @GetMapping("/listar")
	    public List<Estudiante> listarTodos() {
	        return estudianteService.findAll();
	    }

	    @PostMapping
	    public Estudiante guardar(@RequestBody Estudiante e) {
	        return estudianteService.save(e);

	    }
	    
	    @DeleteMapping("/{id}")
	    public void eliminar(@PathVariable Integer id ) {
	    	estudianteService.deleteById(id);
	    	
	    }
	    
	    @PutMapping("/actualizar/{id}")
	    public Estudiante actualizar(@RequestBody Estudiante e, @PathVariable Integer id) {

	        Estudiante eNBD = estudianteService.findById(id).get();

	        eNBD.setCodigo(e.getCodigo());
	        eNBD.setNombre(e.getNombre());
	        eNBD.setApellido(e.getApellido());
	        eNBD.setEdad(e.getEdad());

	        estudianteService.save(eNBD);

	        return e;
	    }
}

