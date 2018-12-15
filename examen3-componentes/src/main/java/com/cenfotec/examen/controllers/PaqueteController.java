package com.cenfotec.examen.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examen.entities.Factura;
import com.cenfotec.examen.entities.Paquete;
import com.cenfotec.examen.entities.Prealerta;
import com.cenfotec.examen.entities.Vuelo;
import com.cenfotec.examen.repositories.PaqueteRepository;
import com.cenfotec.examen.repositories.VueloRepository;
import com.cenfotec.examen.utils.FechaHelper;

@RestController
@RequestMapping("/paquete")
public class PaqueteController {
	@Autowired
	PaqueteRepository paqueteService;
	@Autowired
	VueloRepository vueloService;

	@PostMapping()
	public Paquete registrarPaquete(@RequestBody Paquete paquete) {
		paquete.setPrealerta(false);
		Paquete paqueteGuardado = paqueteService.save(paquete);

		return paqueteGuardado;
	}

	@PutMapping("/prealerta")
	public String prealertarPaquete(@RequestBody Prealerta prealerta) {
		Optional<Paquete> paquete = paqueteService.findOneByCourierId(prealerta.getIdCourier());

		if (paquete.isPresent()) {
			Paquete paquetePrealertado = paquete.get();
			paquetePrealertado.setPrealerta(true);
			paquetePrealertado.setFactura(prealerta.getFactura());

			paqueteService.save(paquetePrealertado);
			agregarPaqueteVuelo(paquetePrealertado);

			return  "Request exitoso.";
		}

		return "Request invalido";
	}

	@PutMapping("/factura/{idCourier}")
	public String facturarPaquete(@PathVariable long idCourier, @RequestBody Factura factura) {
		Optional<Paquete> paquete = paqueteService.findOneByCourierId(idCourier);

		if (paquete.isPresent()) {
			Paquete paquetePrealertado = paquete.get();
			paquetePrealertado.setFactura(factura);
			paqueteService.save(paquetePrealertado);
			agregarPaqueteVuelo(paquetePrealertado);

			return "Request exitoso.";
		}

		return "Request invalido.";
	}


	private void agregarPaqueteVuelo(Paquete paqueteGuardado) {
		String fechaVuelo = FechaHelper.getFechaVuelo(paqueteGuardado.getFecha());
		Vuelo vuelo = new Vuelo();
		Optional<Vuelo> optVuelo = vueloService.findById(fechaVuelo);

		if (optVuelo.isPresent()) {
			vuelo = optVuelo.get();
			vuelo.getListaPaquetes().add(paqueteGuardado);
		} else {
			vuelo.setFechaVuelo(fechaVuelo);
			vuelo.getListaPaquetes().add(paqueteGuardado);
		}

		vueloService.save(vuelo);
	}

	@GetMapping("/list")
	public List<Paquete> getPaquetesList() {
		return paqueteService.findAll();
	}

	@GetMapping("/enespera")
	public List<Paquete> getPaquetesEnEspera() {
		return paqueteService.findEnEspera();
	}

	@GetMapping("/list/{idCuenta}") 
	public List<Paquete> getPaqueteByCuenta(@PathVariable Long idCuenta) {
		return paqueteService.findByCuenta(idCuenta);
	}
}
