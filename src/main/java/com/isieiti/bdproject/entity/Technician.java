package com.isieiti.bdproject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "technicians")
public class Technician {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    @ManyToOne
    @JoinColumn(name = "instrument_id")
    private Instrument instrument;
}
