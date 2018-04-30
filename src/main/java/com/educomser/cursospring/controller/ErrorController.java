/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educomser.cursospring.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * @author hmontes
 */
@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(Exception.class)
    public String showInternalServerError() {
        return "error/500";
    }
}
