package com.nitech.spdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitech.spdata.entity.AttendanceEntity;
import com.nitech.spdata.repository.AttendanceRepository;
import com.nitech.spdata.repository.SituationRepository;

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
