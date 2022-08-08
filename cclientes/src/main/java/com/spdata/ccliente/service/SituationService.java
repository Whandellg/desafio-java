package com.spdata.ccliente.service;

import java.util.List;

import com.spdata.ccliente.repository.SituationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spdata.ccliente.entity.SituationEntity;

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
