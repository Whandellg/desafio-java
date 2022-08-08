package com.spdata.ccliente.repository;

import com.spdata.ccliente.entity.AttendanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository <AttendanceEntity, Integer>{
    AttendanceEntity findOrderEntityById(Integer id);
}
