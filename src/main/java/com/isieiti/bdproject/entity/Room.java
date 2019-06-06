package com.isieiti.bdproject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_avaliable")
    private boolean avaliable;

    private String type;

    @Column(name = "room_number")
    private int number;
}
