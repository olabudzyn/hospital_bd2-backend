package com.isieiti.bdproject.dto;

import lombok.Data;

@Data
public class RoomDTO {

    private Long id;

    private boolean avaliable;

    private String type;

    private int number;
}
