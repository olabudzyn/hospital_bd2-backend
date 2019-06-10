package com.isieiti.bdproject.dto;

import com.isieiti.bdproject.enums.MedicalEmployeeRole;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WithdrawalReportDTO {

    private Long id;

    private String employeeName;

    private String employeeSurname;

    private MedicalEmployeeRole employeeType;

    private LocalDateTime creationTimestamp;
}
