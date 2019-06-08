package com.isieiti.bdproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InstrumentDTO {

    private Long id;

    private String type;

    private String serialNumber;

    private LocalDateTime lastCheckTimestamp;

    private LocalDateTime checkPeriod;

}
