package com.isieiti.bdproject.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "perioperative_room_reservations")
public class PerioperativeRoomReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_timestamp")
    private LocalDateTime startTimestamp;

    @Column(name = "end_timestamp")
    private LocalDateTime endTimestamp;

    private String type;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private PerioperativeRoom room;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
