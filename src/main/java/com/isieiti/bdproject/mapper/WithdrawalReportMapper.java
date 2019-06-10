package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.WithdrawalReportDTO;
import com.isieiti.bdproject.dto.WithdrawalReportPostDTO;
import com.isieiti.bdproject.entity.WithdrawalReport;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class WithdrawalReportMapper {

    @Mappings({
            @Mapping(target = "employeeName", source = "withdrawalReport.employee.name"),
            @Mapping(target = "employeeSurname", source = "withdrawalReport.employee.surname"),
            @Mapping(target = "employeeType", source = "withdrawalReport.employee.type"),
    })
    public abstract WithdrawalReportDTO toWithdrawalReportDTO(WithdrawalReport withdrawalReport);

    @Mapping(target = "employeeId", source = "employee.id")
    public abstract WithdrawalReportPostDTO toWithdrawalReportPostDTO(WithdrawalReport withdrawalReport);

    public abstract List<WithdrawalReportDTO> toWithdrawalReportDTOs(List<WithdrawalReport> withdrawalReports);

    @Mapping(target = "employee.id", source = "employeeId")
    public abstract WithdrawalReport toWithdrawalReport(WithdrawalReportPostDTO withdrawalReportPostDTO);
}
