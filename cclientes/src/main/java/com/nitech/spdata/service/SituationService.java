package com.nitech.spdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitech.spdata.entity.SituationEntity;
import com.nitech.spdata.repository.SituationRepository;

@Service
public class SituationService {
	@Autowired
	SituationRepository repository;

	public SituationEntity save(SituationEntity product) {
		return repository.save(product);
	}

	public SituationEntity findById(Integer id) {
		return repository.findProductEntityById(id);
	}

	public List<SituationEntity> findAll() {
		return repository.findAll();
	}
}
