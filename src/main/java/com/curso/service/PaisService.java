package com.curso.service;

import java.util.List;

import com.curso.domain.Contrie;
import com.curso.domain.Region;

public interface PaisService {
	List <Contrie> getAllPaises(int idPais);
//    List<Producto> getProductosPorCategoria(String categoria); 
//   // List<Producto> getProductosPorFiltro(Map<String, List<String>> paramsFiltro);
//    Producto getProductoPorId(String idProducto);
//	void addProducto(Producto p);
//	void modifyP(Producto productoModificar);
//	void remove(String idProducto);
	Contrie findById(int idPais);
	void remove(int idPais);
	void addPais(Contrie nuevoPais);
}
