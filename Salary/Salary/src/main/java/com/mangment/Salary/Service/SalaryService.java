package com.mangment.Salary.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mangment.Salary.Entity.Salary;


@Service
public interface SalaryService {
    List<Salary> getAllSalaries();
    Salary getSalaryById(Integer id);
    Salary createSalary(Salary salary);
    Salary updateSalary(Integer id, Salary salary);
    void deleteSalary(Integer id);
}
