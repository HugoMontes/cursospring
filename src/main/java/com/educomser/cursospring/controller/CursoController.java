package com.educomser.cursospring.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.educomser.cursospring.model.CursoModel;
import com.educomser.cursospring.service.CursoService;

@Controller
@RequestMapping("/curso")
public class CursoController {
	
	private static final Log LOG=LogFactory.getLog(CursoController.class);
	
	@Autowired
	@Qualifier("cursoServiceImpl")
	private CursoService cursoService;
	
	@GetMapping("/listar")
	public ModelAndView listCursos() {
		LOG.info("Call: listAllCursos");
		ModelAndView mv=new ModelAndView("curso/index");
		mv.addObject("cursos", new CursoModel());
		mv.addObject("cursos", cursoService.listAllCursos());
		return mv;
	}
	
	@GetMapping("/create")
	public String createCurso(Model model) {
		LOG.info("Call: createCurso");
        model.addAttribute("curso", new CursoModel());
        return "curso/create";
    }
	
	@PostMapping("/save")
	public String saveCurso(@ModelAttribute("curso") CursoModel curso){
		LOG.info("Call: saveCursos --PARAM: "+curso.toString());
		cursoService.addCurso(curso);
		return "redirect:/curso/listar";
	}
	
	@GetMapping("/listar/precio/{precio}")
	public ModelAndView listCursosByPrecio(@PathVariable("precio") float precio) {
		LOG.info("Call: listAllCursos");
		ModelAndView mv=new ModelAndView("curso/index");
		mv.addObject("cursos", new CursoModel());
		mv.addObject("cursos", cursoService.listAllCursosByPrecio(precio));
		return mv;
	}
	
}
