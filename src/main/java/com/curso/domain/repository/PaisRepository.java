package com.curso.domain.repository;

import java.util.List;

import com.curso.domain.Contrie;
import com.curso.domain.Producto;
import com.curso.domain.Region;

public interface PaisRepository {
	List <Contrie> getAllPaises(int idPais);

	Contrie findById(int idPais);

	void remove(int idPais);

	void addPais(Contrie nuevoPais);
}
