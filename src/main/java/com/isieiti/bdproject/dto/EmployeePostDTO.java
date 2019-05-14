package com.isieiti.bdproject.dto;

import lombok.Data;

@Data
public class EmployeePostDTO {

        private Long id;

        private String name;

        private String surname;

        private String prefix;

        private String type;

        private Long wardId;
}
