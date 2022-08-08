package com.spdata.ccliente.controller;

import com.spdata.ccliente.entity.AttendanceEntity;
import com.spdata.ccliente.service.AttendanceService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/order")
@RestController
public class AttendanceController {

    @Autowired
    AttendanceService attendanceService;
    @PostMapping
    public ResponseEntity< ? > save(@RequestBody AttendanceEntity attendanceEntity){
        return ResponseEntity.ok(attendanceService.save(attendanceEntity));
    }
    @GetMapping
    public ResponseEntity < ? > find(@RequestParam Integer id){
        return ResponseEntity.ok(attendanceService.findById(id));
    }
    
    @GetMapping("/findAll")
    public ResponseEntity <List<?>> findAll(){
    	return ResponseEntity.ok(attendanceService.findAll());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remove(@PathVariable Integer id) {
        attendanceService.delete(id);
    }
}



