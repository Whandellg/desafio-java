package com.spdata.ccliente.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.List;

import com.spdata.ccliente.service.SituationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.spdata.ccliente.entity.SituationEntity;

@ExtendWith(SpringExtension.class)
@WebMvcTest(SituationController.class)
class SituationControllerTest {

	@Autowired
	SituationController controller;
	@MockBean
    SituationService service;
	@MockBean
    SituationEntity situation;

	@Test
	void testSave() {
		assertEquals(controller.save(any()).getStatusCodeValue(), HttpStatus.OK.value());
	}

	@Test
	void testFind() {
		when(controller.find(any())).thenReturn(situation);
	}

	@Test
	void testFindAll() {
		when(controller.findAll()).thenReturn(List.of(situation));
	}

}
