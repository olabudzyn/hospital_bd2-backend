package com.isieiti.bdproject.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "instruments")
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "last_check_timestamp")
    private LocalDateTime lastCheckTimestamp;

    @Column(name = "check_period")
    private LocalDateTime checkPeriod;
}
