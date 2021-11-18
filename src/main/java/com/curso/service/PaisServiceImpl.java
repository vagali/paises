package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.domain.Contrie;
import com.curso.domain.repository.PaisRepository;
@Service
public class PaisServiceImpl implements PaisService {
	@Autowired
	private PaisRepository paisRepository;

	@Override
	public List<Contrie> getAllPaises(int idPais) {
		return paisRepository.getAllPaises(idPais);
	}

	@Override
	public void remove(int idPais) {
		paisRepository.remove(idPais);
		
	}

	@Override
	public Contrie findById(int idPais) {
		return paisRepository.findById(idPais);
		
	}

	@Override
	public void addPais(Contrie nuevoPais) {
		paisRepository.addPais(nuevoPais);
		
	}
	
	
}
