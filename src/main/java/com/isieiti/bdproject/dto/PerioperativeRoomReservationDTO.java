package com.isieiti.bdproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PerioperativeRoomReservationDTO {

    private Long id;

    private LocalDateTime startTimestamp;

    private LocalDateTime endTimestamp;

    private String employeeName;

    private String employeeSurname;

    private String employeeType;

    private int roomNumber;

    private int bedsNumber;
}
