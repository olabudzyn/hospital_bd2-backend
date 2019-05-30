package com.isieiti.bdproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InstrumentReservationDTO {

    private Long id;

    private LocalDateTime startTimestamp;

    private LocalDateTime endTimestamp;

    private String employeeName;

    private String employeeSurname;

    private String employeeType;

    private String serialNumber;

    private String instrumentType;
}
