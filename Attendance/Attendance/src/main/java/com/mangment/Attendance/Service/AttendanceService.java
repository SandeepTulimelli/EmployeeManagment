package com.mangment.Attendance.Service;

import java.util.List;

import com.mangment.Attendance.Entity.Attendance;



public interface AttendanceService {
    List<Attendance> getAllAttendanceRecords();
    Attendance getAttendanceById(Integer id);
    Attendance createAttendance(Attendance attendance);
    Attendance updateAttendance(Integer id, Attendance attendance);
    void deleteAttendance(Integer id);
}

