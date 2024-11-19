package com.mangment.Salary.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mangment.Salary.Entity.Salary;
import com.mangment.Salary.Service.SalaryService;

@RestController
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping
    public List<Salary> getAllSalaries() {
        return salaryService.getAllSalaries();
    }

    @GetMapping("/salaries/{id}")
    public ResponseEntity<Salary> getSalaryById(@PathVariable Integer id) {
        Salary salary = salaryService.getSalaryById(id);
        return ResponseEntity.ok(salary);
    }

    @PostMapping("/salaries")
    public Salary createSalary(@RequestBody Salary salary) {
        return salaryService.createSalary(salary);
    }

    @PutMapping("/salaries/{id}")
    public ResponseEntity<Salary> updateSalary(@PathVariable Integer id, @RequestBody Salary salary) {
        Salary updatedSalary = salaryService.updateSalary(id, salary);
        return ResponseEntity.ok(updatedSalary);
    }

    @DeleteMapping("/salaries/{id}")
    public ResponseEntity<Void> deleteSalary(@PathVariable Integer id) {
        salaryService.deleteSalary(id);
        return ResponseEntity.noContent().build();
    }
}
