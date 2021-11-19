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
	private int id;
	
	@GetMapping(path = "/pais/{idRegion}")
	public String getPaises(Model model,@PathVariable("idRegion") int idRegion) {
		model.addAttribute("paises", paisService.getAllPaisesByRegion(idRegion));
		this.id = idRegion;
		return "paises";
	}
	@GetMapping(value = "/pais/borrar/{idPais}")
	public String removeProducto(@PathVariable("idPais") String idPais) {
		paisService.remove(idPais);
		return "redirect:/";
	}
	@GetMapping(value = "/pais/nuevo/")
	public String getNuevoPaisFormu(Model model) {
		Contrie nuevoPais = new Contrie();
		model.addAttribute("nuevoPais", nuevoPais);
		return "nuevo-pais";
	}

	@PostMapping(value = "/pais/nuevo/")
	public String crearProducto(@ModelAttribute("nuevoPais") Contrie nuevoPais) {
		nuevoPais.setRegionID(this.id);
		paisService.addPais(nuevoPais);
		return "redirect:/";
	}
}
