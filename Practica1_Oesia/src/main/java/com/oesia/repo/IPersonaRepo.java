package com.oesia.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oesia.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

	
}
