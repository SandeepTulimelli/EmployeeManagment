package com.mangment.department.Service;

import java.util.List;

import com.mangment.department.Entity.Department;


public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Integer id);
    Department createDepartment(Department department);
    Department updateDepartment(Integer id, Department department);
    void deleteDepartment(Integer id);
}
