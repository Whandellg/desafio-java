package com.spdata.ccliente.controller;

import java.util.List;

import com.spdata.ccliente.service.SituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spdata.ccliente.entity.SituationEntity;

@RequestMapping("/api/product")
@RestController
public class SituationController {
	@Autowired
    SituationService service;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody SituationEntity product) {
		return ResponseEntity.ok(service.save(product));

	}

	@GetMapping
	public SituationEntity find(@RequestParam Integer id) {
		return service.findById(id);
	}
	
	@GetMapping("/findAll")
	public List<SituationEntity> findAll(){
		return service.findAll();
	}

}
