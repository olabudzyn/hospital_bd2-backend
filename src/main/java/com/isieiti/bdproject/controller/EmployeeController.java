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
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    private final EmployeeMapper mapper;
    private final EmployeeService service;
    private final WardService wardService;

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
        Ward ward = wardService.findById(employeeDTO.getWardId());
        Employee employee = mapper.toEmployee(employeeDTO);
        employee.setWard(ward);
        return mapper.toEmployeePostDTO(service.saveEmployee(employee));
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
        //Calendar c = Calendar.getInstance();
        //c.set(Calendar.DAY_OF_MONTH, 1);
    }
}
