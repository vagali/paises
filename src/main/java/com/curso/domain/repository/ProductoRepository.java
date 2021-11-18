
package com.curso.domain.repository;

import com.curso.domain.Producto;
import java.util.List;
import java.util.Map;

public interface ProductoRepository {
    List <Producto> getAllProductos();
    Producto getProductoPorId(String idProducto);
    List<Producto> getProductosPoCategoria(String categoria);
	void addProducto(Producto p);
	void modifyP(Producto productoModificar);
	void remove(String idProducto);
}
