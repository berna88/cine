package com.consistent.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sun.awt.ModalExclude;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method=RequestMethod.GET)
	public String goHome(Model model) {
		//Mi logica de negocio
		String titulo = "Bernardo";
		model.addAttribute("titulo", titulo);
		return "home";
	}
}
