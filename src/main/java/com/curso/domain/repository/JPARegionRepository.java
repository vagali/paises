package com.curso.domain.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.curso.domain.Producto;
import com.curso.domain.Region;
@Repository
public class JPARegionRepository implements RegionRepository {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Region> getAllRegiones() {
		Query query = entityManager.createNamedQuery("Region.findAll");
		return query.getResultList();
	}

}
