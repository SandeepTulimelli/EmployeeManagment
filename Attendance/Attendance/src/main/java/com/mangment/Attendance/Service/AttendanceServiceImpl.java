package com.mangment.Attendance.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangment.Attendance.Entity.Attendance;
import com.mangment.Attendance.Repository.AttendanceRepository;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    @Override
    public List<Attendance> getAllAttendanceRecords() {
        return attendanceRepository.findAll();
    }

    @Override
    public Attendance getAttendanceById(Integer id) {
        return attendanceRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    @Override
    public Attendance updateAttendance(Integer id, Attendance attendance) {
        Attendance existingAttendance = getAttendanceById(id);
        existingAttendance.setDate(attendance.getDate());
        existingAttendance.setCheckInTime(attendance.getCheckInTime());
        existingAttendance.setCheckOutTime(attendance.getCheckOutTime());
        existingAttendance.setStatus(attendance.getStatus());
        return attendanceRepository.save(existingAttendance);
    }

    @Override
    public void deleteAttendance(Integer id) {
        attendanceRepository.deleteById(id);
    }
}

