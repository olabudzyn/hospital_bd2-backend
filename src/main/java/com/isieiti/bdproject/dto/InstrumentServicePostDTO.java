package com.isieiti.bdproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InstrumentServicePostDTO {

    private Long id;

    private LocalDateTime startTime;

    private boolean finished;

    private Long instrumentId;

    private Long technicianId;
}
