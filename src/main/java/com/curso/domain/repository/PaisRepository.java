package com.curso.domain.repository;

import java.util.List;

import com.curso.domain.Contrie;

public interface PaisRepository {
	List <Contrie> getAllPaisesByRegion(int idRegion);

	Contrie findById(String idPais);

	void remove(String idPais);

	void addPais(Contrie nuevoPais);
}
