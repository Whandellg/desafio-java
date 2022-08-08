package com.spdata.ccliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spdata.ccliente.entity.PacientEntity;
import com.spdata.ccliente.service.PacientService;

@RequestMapping("/api/client")
@RestController
public class PacientController {
	@Autowired
	PacientService pacientService;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody PacientEntity client) {
		return ResponseEntity.ok(pacientService.save(client));
	}

	@GetMapping("/getById/{id}")
	public PacientEntity find(@RequestParam Integer id) {
		return pacientService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> remove(@PathVariable Integer id) {
		return pacientService.delete(id);
	}

}


