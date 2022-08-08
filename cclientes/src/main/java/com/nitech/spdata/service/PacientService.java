package com.nitech.spdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nitech.spdata.entity.PacientEntity;
import com.nitech.spdata.repository.PacientRepository;

@Service
public class PacientService {
	@Autowired
	PacientRepository pacientRepository;

	public PacientEntity save(PacientEntity client) {
		return pacientRepository.save(client);
	}

	public PacientEntity findById(Integer id) {
		return pacientRepository.findClientEntityById(id);
	}

	public ResponseEntity<?> delete(Integer id) {
		try {
			pacientRepository.deleteById(id);
			return new ResponseEntity<>("Deletado com sucesso!", HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>("Não é possível deletar. Id não encontrado!", HttpStatus.NOT_FOUND);
		}

	}

}