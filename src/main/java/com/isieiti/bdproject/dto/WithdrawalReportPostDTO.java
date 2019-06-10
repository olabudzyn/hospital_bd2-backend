package com.isieiti.bdproject.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WithdrawalReportPostDTO {

    private Long id;

    private LocalDateTime creationTimestamp;

    private Long employeeId;
}
