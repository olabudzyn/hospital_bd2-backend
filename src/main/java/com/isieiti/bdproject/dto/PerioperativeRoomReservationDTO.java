package com.isieiti.bdproject.dto;

import com.isieiti.bdproject.enums.MedicalEmployeeRole;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PerioperativeRoomReservationDTO {

    private Long id;

    private LocalDateTime startTimestamp;

    private LocalDateTime endTimestamp;

    private String employeeName;

    private String employeeSurname;

    private MedicalEmployeeRole employeeType;

    private int roomNumber;

    private int bedsNumber;
}
