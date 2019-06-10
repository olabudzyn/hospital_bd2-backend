package com.isieiti.bdproject.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(name = "perioperative_rooms")
public class PerioperativeRoom {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "room_number")
    private int roomNumber;

    @Column(name = "beds_number")
    private int bedsNumber;
}
