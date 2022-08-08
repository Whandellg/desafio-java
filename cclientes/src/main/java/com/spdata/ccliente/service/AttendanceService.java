package com.spdata.ccliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spdata.ccliente.entity.AttendanceEntity;
import com.spdata.ccliente.repository.AttendanceRepository;
import com.spdata.ccliente.repository.SituationRepository;

@Service
public class AttendanceService {
	@Autowired
	AttendanceRepository attendanceRepository;

	@Autowired
    SituationRepository situationRepository;

	public AttendanceEntity save(AttendanceEntity attendance) {

		for (int i = 0; i < attendance.getProducts().size(); i++) {
			attendance.setPacient_id(attendance.getPacient_id()
					+ situationRepository.findProductEntityById(attendance.getProducts().get(i).getId()).getId());
		}
		return attendanceRepository.save(attendance);
	}

	public AttendanceEntity findById(Integer id) {
		return attendanceRepository.findOrderEntityById(id);
	}

	public List<AttendanceEntity> findAll() {
		return attendanceRepository.findAll();
	}

    public void delete(Integer id) {
		attendanceRepository.deleteById(id);
    }
}
