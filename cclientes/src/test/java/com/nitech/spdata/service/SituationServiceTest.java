package com.nitech.spdata.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nitech.spdata.entity.SituationEntity;
import com.nitech.spdata.repository.SituationRepository;

@ExtendWith(SpringExtension.class)
@WebMvcTest(SituationService.class)

class SituationServiceTest {
	@Autowired
	SituationService service;
	@MockBean
	SituationRepository repository;
	@MockBean
    SituationEntity situation;

	@Test
	void testSave() {
		when(service.save(any())).thenReturn(situation);
	}

	@Test
	void testFindById() {
		when(service.findById(any())).thenReturn(situation);
	}

	@Test
	void testFindAll() {
		when(service.findAll()).thenReturn(List.of(situation));
	}

}
