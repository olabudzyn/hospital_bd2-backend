package com.isieiti.bdproject.dto;

import com.isieiti.bdproject.enums.MedicalEmployeeRole;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeDTO {

    private Long id;

    private String name;

    private String surname;

    private String prefix;

    private MedicalEmployeeRole type;

    private String wardName;

}
