package com.spdata.ccliente.service;

import com.spdata.ccliente.entity.AttendanceEntity;
import com.spdata.ccliente.repository.AttendanceRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AttendanceService.class)
public class AttendanceServiceTest {

    @Autowired
    AttendanceService attendanceService;

    @MockBean
    AttendanceRepository attendanceRepository;

    @MockBean
    AttendanceEntity attendanceEntity;

    @Test
    void testSave() {
        when(attendanceService.save(any())).thenReturn(attendanceEntity);
    }

    @Test
    void testFindAll(){when(attendanceService.findAll()).thenReturn(List.of(attendanceEntity));

    }
}

