package com.nitech.spdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nitech.spdata.entity.SituationEntity;
import com.nitech.spdata.service.SituationService;

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
