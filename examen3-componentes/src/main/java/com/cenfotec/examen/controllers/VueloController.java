package com.cenfotec.examen.controllers;

import java.io.PrintStream;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cenfotec.examen.utils.FechaHelper;
import com.cenfotec.examen.entities.Vuelo;
import com.cenfotec.examen.repositories.VueloRepository;

@RestController
@RequestMapping("/vuelo")
public class VueloController {
	@Autowired
	VueloRepository vueloService;
	
	@GetMapping("/getPaquetesProximoVuelo") 
	public Vuelo getPaquetesProximoVuelo() {
		String fechaVuelo = FechaHelper.getFechaVuelo(new Date());
		
		Optional<Vuelo> vuelo = vueloService.findById(fechaVuelo);
		
		PrintStream out = System.out;
		out.println("Fecha:" + fechaVuelo);	
		
		if(vuelo.isPresent()) {
			return vuelo.get();
		}
		
		return new Vuelo();
	}
}
