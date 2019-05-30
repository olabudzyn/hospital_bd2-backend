package com.isieiti.bdproject.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Table(name = "wards")
public class Ward {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;
}
