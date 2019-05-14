package com.isieiti.bdproject.controller;

import com.isieiti.bdproject.dto.EmployeeDTO;
import com.isieiti.bdproject.mapper.EmployeeMapper;
import com.isieiti.bdproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeMapper mapper;

    @Autowired
    private EmployeeService service;

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {
        return mapper.toEmployeeDTO(service.getSingleEmployee(id));
    }
}
