package com.educomser.cursospring.service;

import java.util.List;

import com.educomser.cursospring.entity.Curso;

public interface CursoService {

	public abstract List<Curso> listAllCursos();
	
	public abstract Curso addCurso(Curso curso);
	
	public abstract void removeCurso(Curso curso);
	
	public abstract Curso updateCurso(Curso curso);
	
}
