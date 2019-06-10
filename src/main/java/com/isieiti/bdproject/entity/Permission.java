package com.isieiti.bdproject.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "permissions")
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String permission;
}
