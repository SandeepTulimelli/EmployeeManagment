package com.mangment.Salary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangment.Salary.Entity.Salary;
import com.mangment.Salary.Repository.SalaryRepository;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepository salaryRepository;

    @Override
    public List<Salary> getAllSalaries() {
        return salaryRepository.findAll();
    }

    @Override
    public Salary getSalaryById(Integer id) {
        return salaryRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public Salary createSalary(Salary salary) {
        return salaryRepository.save(salary);
    }

    @Override
    public Salary updateSalary(Integer id, Salary salary) {
        Salary existingSalary = getSalaryById(id);
        existingSalary.setBaseSalary(salary.getBaseSalary());
        existingSalary.setBonuses(salary.getBonuses());
        existingSalary.setDeductions(salary.getDeductions());
        existingSalary.setPaymentDate(salary.getPaymentDate());
        return salaryRepository.save(existingSalary);
    }

    @Override
    public void deleteSalary(Integer id) {
        salaryRepository.deleteById(id);
    }
}

