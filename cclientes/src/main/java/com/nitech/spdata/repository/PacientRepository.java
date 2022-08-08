package com.nitech.spdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nitech.spdata.entity.PacientEntity;

@Repository
public interface PacientRepository extends JpaRepository<PacientEntity, Integer> {

	PacientEntity findClientEntityById(Integer id);

}
