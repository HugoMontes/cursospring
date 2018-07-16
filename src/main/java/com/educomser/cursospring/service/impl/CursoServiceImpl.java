package com.educomser.cursospring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.educomser.cursospring.converter.CursoConverter;
import com.educomser.cursospring.entity.Curso;
import com.educomser.cursospring.model.CursoModel;
import com.educomser.cursospring.repository.CursoJpaRepository;
import com.educomser.cursospring.service.CursoService;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements CursoService {

	
	@Autowired
	@Qualifier("cursoJpaRepository")
	private CursoJpaRepository cursoRepository;
	
	
	@Autowired
	@Qualifier("cursoConverter")
	private CursoConverter cursoConverter;
	
	// Ya existen los metodos basicos del CRUD
	@Override
	public List<CursoModel> listAllCursos() {
		List<Curso> cursos = cursoRepository.findAll();
		List<CursoModel> cursosModel = new ArrayList<>();
		for(Curso curso : cursos) {
			cursosModel.add(cursoConverter.entityToModel(curso));
		}
		return cursosModel;
	}

	@Override
	public CursoModel addCurso(CursoModel cursoModel) {
		Curso curso=cursoRepository.save(cursoConverter.modelToEntity(cursoModel));
		return cursoConverter.entityToModel(curso);
	}

	@Override
	public void removeCurso(CursoModel cursoModel) {
		cursoRepository.delete(cursoConverter.modelToEntity(cursoModel));
	}

	@Override
	public Curso updateCurso(CursoModel cursoModel) {
		return cursoRepository.save(cursoConverter.modelToEntity(cursoModel));
	}

	
}
