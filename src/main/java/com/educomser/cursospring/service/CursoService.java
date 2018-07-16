package com.educomser.cursospring.service;

import java.util.List;

import com.educomser.cursospring.entity.Curso;
import com.educomser.cursospring.model.CursoModel;

public interface CursoService {

	public abstract List<CursoModel> listAllCursos();
	
	public abstract CursoModel addCurso(CursoModel cursoModel);
	
	public abstract void removeCurso(CursoModel cursoModel);
	
	public abstract Curso updateCurso(CursoModel cursoModel);
	
}
