package com.curso.domain.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.curso.domain.Producto;
@Repository
@Qualifier("JPAProductoRepository")
public class JPAProductoRepository implements ProductoRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Producto> getAllProductos() {
		Query query = entityManager.createNamedQuery("Producto.findAll");
		return query.getResultList();
	}

	@Override
	public Producto getProductoPorId(String idProducto) {
		return entityManager.find(Producto.class, idProducto);
	}

	@Override
	public List<Producto> getProductosPoCategoria(String categoria) {
		ArrayList<Producto> pr = (ArrayList<Producto>) entityManager.createNamedQuery("Producto.findByCategoria").setParameter("categoria", categoria);
		return pr;
	}

	@Override
	public void addProducto(Producto p) {
		entityManager.persist(p);
		
	}

	@Override
	public void modifyP(Producto productoModificar) {
		entityManager.merge(productoModificar);
		
	}

	@Override
	public void remove(String idProducto) {
		entityManager.remove(this.getProductoPorId(idProducto));
		
	}


	

}
