package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.EmployeeDTO;
import com.isieiti.bdproject.dto.EmployeePostDTO;
import com.isieiti.bdproject.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class EmployeeMapper {

    @Mapping(target = "wardName", source = "ward.name")
    public abstract EmployeeDTO toEmployeeDTO(Employee employee);

    @Mapping(target = "wardId", source = "ward.id")
    public abstract EmployeePostDTO toEmployeePostDTO(Employee employee);

    public abstract List<EmployeeDTO> toEmployeeDTOs(List<Employee> employees);

    @Mapping(target = "ward.id", source = "employeeDTO.wardId")
    public abstract Employee toEmployee(EmployeePostDTO employeeDTO);

}
