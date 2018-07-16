package com.educomser.cursospring.converter;

import org.springframework.stereotype.Component;

import com.educomser.cursospring.entity.Curso;
import com.educomser.cursospring.model.CursoModel;

@Component("cursoConverter")
public class CursoConverter {
	
	// Transforma de un Entity a un model
	public CursoModel entityToModel(Curso curso) {
		CursoModel cursoModel=new CursoModel();
		cursoModel.setNombre(curso.getNombre());
		cursoModel.setDescripcion(curso.getDescripcion());
		cursoModel.setPrecio(curso.getPrecio());
		cursoModel.setHoras(curso.getHoras());
		return cursoModel;
	}
	
	// Transforma de un Model a un Entity
	public Curso modelToEntity(CursoModel cursoModel) {
		Curso curso=new Curso();
		curso.setNombre(cursoModel.getNombre());
		curso.setDescripcion(cursoModel.getDescripcion());
		curso.setPrecio(cursoModel.getPrecio());
		curso.setHoras(cursoModel.getHoras());
		return curso;
	}
}
