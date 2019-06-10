package com.isieiti.bdproject.entity;

import com.isieiti.bdproject.enums.MedicalEmployeeRole;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(name = "medical_employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private String prefix;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private MedicalEmployeeRole type;

    @ManyToOne
    @JoinColumn(name = "ward_id")
    private Ward ward;


}
