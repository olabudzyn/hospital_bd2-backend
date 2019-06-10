package com.isieiti.bdproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TechnicianDTO {

    private Long id;

    private String name;

    private String surname;

    private String serialNumber;

    private String instrumentType;

    private LocalDateTime lastCheckTimestamp;

    private LocalDateTime checkPeriod;
}
