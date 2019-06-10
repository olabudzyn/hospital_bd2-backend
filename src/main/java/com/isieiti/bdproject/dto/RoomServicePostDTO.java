package com.isieiti.bdproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RoomServicePostDTO {

    private Long id;

    private LocalDateTime startTime;

    private boolean finished;

    private Long technicianId;

    private Long roomId;
}
