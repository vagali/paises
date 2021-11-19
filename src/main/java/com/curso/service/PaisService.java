package com.curso.service;

import java.util.List;

import com.curso.domain.Contrie;

public interface PaisService {
	List <Contrie> getAllPaisesByRegion(int idRegion);
	Contrie findById(String idPais);
	void remove(String idPais);
	void addPais(Contrie nuevoPais);
}
