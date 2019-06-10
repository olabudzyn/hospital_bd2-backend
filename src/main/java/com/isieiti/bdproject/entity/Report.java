package com.isieiti.bdproject.entity;

import com.isieiti.bdproject.enums.ReportType;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_timestamp")
    private LocalDateTime creationTimestamp;

    @Column(name = "is_closed")
    private boolean closed;

    private String content;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private ReportType type;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
