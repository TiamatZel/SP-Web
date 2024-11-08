package com.example.services;

import com.example.entities.Employee;
import com.example.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(int id) {
        return repository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    public void deleteEmployee(int id) {
        repository.deleteById(id);
    }
}

