package com.educomser.cursospring.repository;

import org.springframework.stereotype.Repository;

import com.educomser.cursospring.entity.Curso;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



@Repository("cursoJpaRepository")
public interface CursoJpaRepository extends JpaRepository<Curso, Serializable> {
	
	// Implementa una query automaticamente
	public abstract List<Curso> findByPrecio(float precio);
	
	// Implementa una query automaticamente
	public abstract Curso findByPrecioAndNombre(float precio, String nombre);
	
	// Implementa una query automaticamente
	public abstract List<Curso> findByNombreOrderByHoras(String nombre);
	
	// Implementa una query automaticamente
	public abstract Curso findByNombreOrPrecio(String nombre, float precio);
	
	@Query("select c from Curso c where c.precio > :min and c.precio < :max")
	public abstract List<Curso> findByPrecioMaxMin(@Param("min") float min, @Param("max") float max);
}
