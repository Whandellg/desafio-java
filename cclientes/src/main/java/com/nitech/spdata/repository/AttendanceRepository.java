package com.nitech.spdata.repository;

import com.nitech.spdata.entity.AttendanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository <AttendanceEntity, Integer>{
    AttendanceEntity findOrderEntityById(Integer id);
}
