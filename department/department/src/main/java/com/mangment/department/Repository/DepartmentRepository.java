package com.mangment.department.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mangment.department.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
