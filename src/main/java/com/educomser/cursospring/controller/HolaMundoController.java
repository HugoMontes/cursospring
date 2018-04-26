package com.educomser.cursospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/holamundo")
public class HolaMundoController {
    
    // GetMapping: anotacion para Spring 4.1
    @GetMapping("/ejemplo")
    public String saludo(){
        // Retorna el nombre de la plantilla a mostrar
        return "ejemplo/index";
    }
    
    // @RequestMapping: anotacion para spring 4.0
    @RequestMapping(value = "/ejemplo/string", method = RequestMethod.GET)
    public String ejemploString(){
        // Retorna simplemente el nombre de la vista, util cuando no se
        // envian datos a la vista.
        return "ejemplo/string_view";
    }

    @RequestMapping(value = "/ejemplo/mv", method = RequestMethod.GET)
    public ModelAndView ejemploMv(){
        // Retorna el nombre de la vista y en algun caso datos a mostrar 
        // en la vista
        ModelAndView mv=new ModelAndView("ejemplo/mv_view");
        mv.addObject("nombre", "Juan Perez");
        return mv;
    }
    
    // Primera forma de enviar parametros
    // http://localhost:8080/holamundo/parametros1?nom=Juan
    @GetMapping("/parametros1")
    public ModelAndView parametros1(@RequestParam(name="nom") String nombre){
        ModelAndView mv=new ModelAndView("ejemplo/mv_view");
        mv.addObject("nombre", nombre);
        return mv;
    }
    
    // Segunda forma de enviar parametros
    // http://localhost:8080/holamundo/parametros2/Juan
    @GetMapping("/parametros2/{nom}")
    public ModelAndView parametros2(@PathVariable("nom") String nombre){
        ModelAndView mv=new ModelAndView("ejemplo/mv_view");
        mv.addObject("nombre", nombre);
        return mv;
    }
}
