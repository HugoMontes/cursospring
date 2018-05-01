package com.educomser.cursospring.service.impl;

import com.educomser.cursospring.service.EjemploService;
import org.springframework.stereotype.Service;

@Service("ejemploService")
public class EjemploServiceImpl implements EjemploService {

    @Override
    public String saludar(String nombre) {
        String mensaje = "Buenas noches " + nombre;
        return mensaje;
    }
}
