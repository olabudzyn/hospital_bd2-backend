package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.Employee;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee getSingleEmployee(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
    }

}
