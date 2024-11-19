package com.mangment.Salary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mangment.Salary.Entity.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Integer> {

}
