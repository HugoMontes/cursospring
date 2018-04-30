package com.educomser.cursospring.controller;

import com.educomser.cursospring.model.Persona;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/persona")
public class PersonaController {

    // Retornando nombre de vista
    @GetMapping("/string")
    public String ejemploString(Model model) {
        model.addAttribute("persona", new Persona("Alex", 65));
        return "persona/index";
    }

    // Retornando objeto Model And View
    @GetMapping("/mv")
    public ModelAndView ejemploMv() {
        ModelAndView mv = new ModelAndView("persona/index");
        mv.addObject("persona", new Persona("Maria", 21));
        return mv;
    }
    
    // Retornando objeto Model And View
    @GetMapping("/listado")
    public ModelAndView listado() {
        ModelAndView mv = new ModelAndView("persona/listado");
        mv.addObject("personas", listadoPersonas());
        return mv;
    }
    
    private List<Persona> listadoPersonas(){
        List<Persona> lista=new ArrayList<Persona>();
        lista.add(new Persona("Marcos", 42));
        lista.add(new Persona("Lucas", 33));
        lista.add(new Persona("Jesus", 16));
        lista.add(new Persona("Ana", 28));
        return lista;
    }
    
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model){
        model.addAttribute("persona",new Persona());
        return "persona/formulario";
    }
    
    @PostMapping("/adicionar")
    public ModelAndView mostrarFormulario(@ModelAttribute("persona") Persona persona){
        ModelAndView mv=new ModelAndView("persona/resultado");
        mv.addObject("persona",persona);
        return mv;
    }
    
    // Primera forma
    @GetMapping("/redireccionar1")
    public String redirect1(){
        return "redirect:/persona/formulario";
    }
    
    // Segunda forma    
    @GetMapping("/redireccionar2")
    public RedirectView redirect2(){
        return new RedirectView("/persona/listado");
    }
    
    // Generar error 500    
    @GetMapping("/dividir")
    public RedirectView dividir(){
        int i=6/0;
        return new RedirectView("/persona/formulario");
    }
}
