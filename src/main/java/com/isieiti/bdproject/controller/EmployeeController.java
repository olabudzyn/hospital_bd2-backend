package com.isieiti.bdproject.controller;

import com.isieiti.bdproject.dto.EmployeeDTO;
import com.isieiti.bdproject.dto.EmployeePostDTO;
import com.isieiti.bdproject.entity.Employee;
import com.isieiti.bdproject.entity.Ward;
import com.isieiti.bdproject.mapper.EmployeeMapper;
import com.isieiti.bdproject.service.EmployeeService;
import com.isieiti.bdproject.service.WardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeMapper mapper;
    private final EmployeeService service;

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {
        return mapper.toEmployeeDTO(service.getSingleEmployee(id));
    }

    @GetMapping
    public List<EmployeeDTO> getEmployees() {
        return mapper.toEmployeeDTOs(service.getAllEmployees());
    }

    @PostMapping
    public EmployeePostDTO postEmployee(@RequestBody EmployeePostDTO employeeDTO) {
        return mapper.toEmployeePostDTO(service.saveEmployee(mapper.toEmployee(employeeDTO)));
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }
}
