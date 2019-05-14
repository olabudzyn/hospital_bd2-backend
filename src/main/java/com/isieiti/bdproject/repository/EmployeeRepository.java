package com.isieiti.bdproject.repository;

import com.isieiti.bdproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class EmployeeRepository implements JpaRepository<Employee, Long> {
}
