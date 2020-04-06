package com.yavirac.gestionycontrol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yavirac.gestionycontrol.entity.Sede;
import com.yavirac.gestionycontrol.service.DepartamentoService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")

public class DepartamentoController {
    @Autowired
    private DepartamentoService departamentoService;

    @GetMapping("/departamentos")
    public List<Sede> getDepartamentos(){
        return departamentoService.getDepartamentos();
    }
}



