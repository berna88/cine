package com.consistent.app.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.consistent.app.models.Peliculas;

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
	
	@RequestMapping( value="/", method=RequestMethod.GET)
	public String mostrarPrincipal(Model model){
		List<Peliculas> peliculas = new LinkedList<Peliculas>();
		peliculas.add(new Peliculas("Final Fantasy", "15:00", "A", true));
		peliculas.add(new Peliculas("Resident", "40:00", "B", true));
		model.addAttribute("peliculas", peliculas);
		return "home";
	}
	
	@RequestMapping(value = "/detail")
	public String mostrarDetalle(Model model){
		String tituloPelicula = "Rapidos y furioso";
		int duracion = 136;
		double precioEntrada = 50;
		model.addAttribute("titulo", tituloPelicula);
		model.addAttribute("duracion", duracion);
		model.addAttribute("precio", precioEntrada);
		return "detail";
		
	}
}
