package com.oesia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oesia.model.Fecha;
import com.oesia.repo.IFechaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IFechaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		Fecha f = new Fecha();
		f.setId(1);
		f.setCodigo("A00");
		f.setFecha("2022-04-25");
		repo.save(f);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}
}
