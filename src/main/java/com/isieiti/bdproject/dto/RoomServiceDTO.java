package com.isieiti.bdproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RoomServiceDTO {

    private Long id;

    private LocalDateTime startTime;

    private boolean finished;

    private String technicianName;

    private String technicianSurname;

    private int roomNumber;

    private String roomType;
}
