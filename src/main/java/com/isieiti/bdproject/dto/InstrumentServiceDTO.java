package com.isieiti.bdproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InstrumentServiceDTO {

    private Long id;

    private LocalDateTime startTime;

    private boolean finished;

    private String serialNumber;

    private String instrumentType;

    private String technicianName;

    private String technicianSurname;
}
