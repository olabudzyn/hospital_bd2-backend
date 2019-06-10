package com.isieiti.bdproject.controller;

import com.isieiti.bdproject.dto.WithdrawalReportDTO;
import com.isieiti.bdproject.dto.WithdrawalReportPostDTO;
import com.isieiti.bdproject.entity.Employee;
import com.isieiti.bdproject.entity.WithdrawalReport;
import com.isieiti.bdproject.mapper.WithdrawalReportMapper;
import com.isieiti.bdproject.service.EmployeeService;
import com.isieiti.bdproject.service.WithdrawalReportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/withdrawal_report")
public class WithdrawalReportController {

    private final WithdrawalReportMapper mapper;
    private final WithdrawalReportService withdrawalReportService;
    private final EmployeeService employeeService;

    @GetMapping("/{id}")
    public WithdrawalReportDTO getWithdrawalReport(@PathVariable Long id) {
        return mapper.toWithdrawalReportDTO(withdrawalReportService.findById(id));
    }

    @GetMapping
    public List<WithdrawalReportDTO> getWithdrawalReports() {
        return mapper.toWithdrawalReportDTOs(withdrawalReportService.getWithdrawalReports());
    }

    @PostMapping
    public WithdrawalReportPostDTO postWithdrawalReport(@RequestBody WithdrawalReportPostDTO withdrawalReportPostDTO) {
        Employee employee = employeeService.getSingleEmployee(withdrawalReportPostDTO.getEmployeeId());
        WithdrawalReport withdrawalReport = mapper.toWithdrawalReport(withdrawalReportPostDTO);
        withdrawalReport.setEmployee(employee);
        return mapper.toWithdrawalReportPostDTO(withdrawalReportService.postWithdrawalReport(withdrawalReport));
    }

    @DeleteMapping
    public void deleteWithdrawalReport(@PathVariable Long id) {
        withdrawalReportService.deleteWithdrawalReport(id);
    }
}
