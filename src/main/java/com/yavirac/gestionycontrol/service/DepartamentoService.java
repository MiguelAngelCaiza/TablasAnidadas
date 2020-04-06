package com.yavirac.gestionycontrol.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yavirac.gestionycontrol.entity.Sede;
import com.yavirac.gestionycontrol.repository.DepartamentoRepository;

@Service

public class DepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;

    public List<Sede> getDepartamentos(){
        return departamentoRepository.findAll();
    }

}
