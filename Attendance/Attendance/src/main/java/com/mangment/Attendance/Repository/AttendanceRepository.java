package com.mangment.Attendance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mangment.Attendance.Entity.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer>{

}
