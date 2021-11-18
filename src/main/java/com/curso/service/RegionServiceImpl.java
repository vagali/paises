package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.domain.Region;
import com.curso.domain.repository.RegionRepository;
@Service
public class RegionServiceImpl implements RegionService {
	@Autowired
	private RegionRepository paisRepository;

	@Override
	public List<Region> getAllRegiones() {
		return paisRepository.getAllRegiones();
	}

}
