package com.yavirac.gestionycontrol.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yavirac.gestionycontrol.entity.Sede;

@Repository
public interface DepartamentoRepository extends JpaRepository<Sede, Integer> {

}



