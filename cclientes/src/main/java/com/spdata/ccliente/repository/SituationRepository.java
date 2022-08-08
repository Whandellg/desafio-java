package com.spdata.ccliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spdata.ccliente.entity.SituationEntity;

@Repository
public interface SituationRepository extends JpaRepository<SituationEntity, Integer> {
	SituationEntity findProductEntityById(Integer Id);

}
