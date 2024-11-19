package com.mangment.Attendance.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mangment.Attendance.Entity.Attendance;
import com.mangment.Attendance.Service.AttendanceService;

import java.util.List;

@RestController
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping
    public List<Attendance> getAllAttendanceRecords() {
        return attendanceService.getAllAttendanceRecords();
    }

    @GetMapping("/attendance/{id}")
    public ResponseEntity<Attendance> getAttendanceById(@PathVariable Integer id) {
        Attendance attendance = attendanceService.getAttendanceById(id);
        return ResponseEntity.ok(attendance);
    }

    @PostMapping("/attendance")
    public Attendance createAttendance(@RequestBody Attendance attendance) {
        return attendanceService.createAttendance(attendance);
    }

    @PutMapping("/attendance/{id}")
    public ResponseEntity<Attendance> updateAttendance(@PathVariable Integer id, @RequestBody Attendance attendance) {
        Attendance updatedAttendance = attendanceService.updateAttendance(id, attendance);
        return ResponseEntity.ok(updatedAttendance);
    }

    @DeleteMapping("/attendance/{id}")
    public ResponseEntity<Void> deleteAttendance(@PathVariable Integer id) {
        attendanceService.deleteAttendance(id);
        return ResponseEntity.noContent().build();
    }
}
