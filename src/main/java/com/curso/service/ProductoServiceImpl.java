
package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.domain.Producto;
import com.curso.domain.repository.ProductoRepository;

@Service
@Transactional
public class ProductoServiceImpl implements ProductoService {
     @Autowired
     @Qualifier("JPAProductoRepository")
    private ProductoRepository productoRepositorio;
   
    
    @Override
    public List<Producto> getTodosProductos() {
       return productoRepositorio.getAllProductos();
    }

    @Override
    public List<Producto> getProductosPorCategoria(String categoria) {
      return productoRepositorio.getProductosPoCategoria(categoria);
    }

    

    @Override
    public Producto getProductoPorId(String idProducto) {
      Producto producto =productoRepositorio.getProductoPorId(idProducto);
      return producto;
    }

	@Override
	public void addProducto(Producto p) {
		productoRepositorio.addProducto(p);
		
	}

	@Override
	public void modifyP(Producto productoModificar) {
		productoRepositorio.modifyP(productoModificar);
		
	}

	@Override
	public void remove(String idProducto) {
		productoRepositorio.remove(idProducto);		
	}




    
}
