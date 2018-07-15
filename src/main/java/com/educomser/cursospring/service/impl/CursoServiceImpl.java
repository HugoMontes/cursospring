package com.educomser.cursospring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.educomser.cursospring.entity.Curso;
import com.educomser.cursospring.repository.CursoJpaRepository;
import com.educomser.cursospring.service.CursoService;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements CursoService {

	
	@Autowired
	@Qualifier("cursoJpaRepository")
	private CursoJpaRepository cursoJpaRepository;

	// Ya existen los metodos basicos del CRUD
	@Override
	public List<Curso> listAllCursos() {
		return cursoJpaRepository.findAll();
	}

	@Override
	public Curso addCurso(Curso curso) {
		return cursoJpaRepository.save(curso);
	}

	@Override
	public void removeCurso(Curso curso) {
		cursoJpaRepository.delete(curso);
	}

	@Override
	public Curso updateCurso(Curso curso) {
		return cursoJpaRepository.save(curso);
	}
}
