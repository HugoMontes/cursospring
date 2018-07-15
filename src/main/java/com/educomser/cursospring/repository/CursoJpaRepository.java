package com.educomser.cursospring.repository;

import org.springframework.stereotype.Repository;

import com.educomser.cursospring.entity.Curso;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository("cursoJpaRepository")
public interface CursoJpaRepository extends JpaRepository<Curso, Serializable> {
	
	// Implementa una query automaticamente
	public abstract Curso findByPrecio(float precio);
	
	// Implementa una query automaticamente
	public abstract Curso findByPrecioAndNombre(float precio, String nombre);
	
	// Implementa una query automaticamente
	public abstract List<Curso> findByNombreOrderByHoras(String nombre);
	
	// Implementa una query automaticamente
	public abstract Curso findByNombreOrPrecio(String nombre, float precio);
}
