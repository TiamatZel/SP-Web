package com.example.services;

import com.example.entities.Department;
import com.example.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    public Optional<Department> getDepartmentById(int id) {
        return repository.findById(id);
    }

    public Department createDepartment(Department department) {
        return repository.save(department);
    }

    public void deleteDepartment(int id) {
        repository.deleteById(id);
    }
}
