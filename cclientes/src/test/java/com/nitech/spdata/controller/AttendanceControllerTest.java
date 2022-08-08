package com.nitech.spdata.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nitech.spdata.entity.AttendanceEntity;
import com.nitech.spdata.service.AttendanceService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AttendanceController.class)
class AttendanceControllerTest {

	@Autowired
	AttendanceController controller;
	@MockBean
	AttendanceService service;
	@MockBean
    AttendanceEntity attendance;

	@Test
	void testSave() {
		assertEquals(controller.save(any()).getStatusCodeValue(), HttpStatus.OK.value());
	}

	//@Test
	void testFind() {
		//assertEquals(controller.buscar(any()).getStatusCodeValue(), HttpStatus.OK.value());
	}

	@Test
	void testFindAll() {
		assertEquals(controller.findAll().getStatusCodeValue(), HttpStatus.OK.value());
	}

}
