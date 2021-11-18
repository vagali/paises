package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.service.RegionService;

@Controller
public class RegionController {
	@Autowired
	private RegionService regionService;

	@GetMapping(path = "/")
	public String list(Model model) {
		model.addAttribute("regiones", regionService.getAllRegiones());

		return "regiones";
	}
}
