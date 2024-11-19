package com.mangment.department.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mangment.department.Entity.Department;
import com.mangment.department.Repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Integer id, Department department) {
        Department existingDepartment = getDepartmentById(id);
        existingDepartment.setDepartmentName(department.getDepartmentName());
        existingDepartment.setLocation(department.getLocation());
        return departmentRepository.save(existingDepartment);
    }

    @Override
    public void deleteDepartment(Integer id) {
        departmentRepository.deleteById(id);
    }
}