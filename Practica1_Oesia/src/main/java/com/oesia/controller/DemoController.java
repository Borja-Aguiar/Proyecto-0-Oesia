package com.oesia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oesia.model.Persona;
import com.oesia.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		Persona p = new Persona();
		p.setIdPersona(1);
		p.setNombre("Joaquin");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}
}
