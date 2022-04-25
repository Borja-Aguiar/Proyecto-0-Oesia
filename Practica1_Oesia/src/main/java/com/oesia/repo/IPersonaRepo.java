package com.oesia.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oesia.model.Fecha;

public interface IPersonaRepo extends JpaRepository<Fecha, Integer> {

	
}
