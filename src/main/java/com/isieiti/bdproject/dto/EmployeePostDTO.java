package com.isieiti.bdproject.dto;

import com.isieiti.bdproject.enums.MedicalEmployeeRole;
import lombok.Data;

@Data
public class EmployeePostDTO {

        private Long id;

        private String name;

        private String surname;

        private String prefix;

        private MedicalEmployeeRole type;

        private Long wardId;
}
