package com.curso.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.domain.Contrie;
import com.curso.service.PaisService;

@Controller
public class PaisController {
	@Autowired
	private PaisService paisService;

	@GetMapping(path = "/pais/{idRegion}")
	public String getPaises(Model model,@PathVariable("idRegion") int idRegion) {
		model.addAttribute("paises", paisService.getAllPaises(idRegion));
		return "paises";
	}
	@GetMapping(value = "/pais/borrar/{idPais}")
	public String removeProducto(@RequestParam("idPais") int idPais) {
		paisService.remove(idPais);
		return "redirect:/regiones";
	}
	@GetMapping(value = "/pais/nuevo")
	public String getNuevoPaisFormu(Model model) {
		Contrie nuevoPais = new Contrie();
		model.addAttribute("nuevoProducto", nuevoPais);
		return "nuevo-pais";
	}

	@PostMapping(value = "/productos/nuevo/{regionId}")
	public String crearProducto(@ModelAttribute("nuevoPais") Contrie nuevoPais,@PathVariable("idRegion") int idRegion) {
		nuevoPais.setRegionID(idRegion);
		paisService.addPais(nuevoPais);
		return "redirect:/paises";
	}
}
