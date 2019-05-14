package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.EmployeeDTO;
import com.isieiti.bdproject.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class EmployeeMapper {

    @Mapping(target = "wardName", source = "ward.name")
    public abstract EmployeeDTO toEmployeeDTO(Employee employee);

}
