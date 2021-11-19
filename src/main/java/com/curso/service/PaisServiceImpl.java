package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.domain.Contrie;
import com.curso.domain.repository.PaisRepository;
@Service
@Transactional
public class PaisServiceImpl implements PaisService {
	@Autowired
	private PaisRepository paisRepository;

	


	@Override
	public Contrie findById(String idPais) {
		return paisRepository.findById(idPais);
		
	}

	@Override
	public void addPais(Contrie nuevoPais) {
		paisRepository.addPais(nuevoPais);
		
	}

	@Override
	public void remove(String idPais) {
		paisRepository.remove(idPais);
		
	}

	@Override
	public List<Contrie> getAllPaisesByRegion(int idRegion) {
		return paisRepository.getAllPaisesByRegion(idRegion);
	}
	
	
}
