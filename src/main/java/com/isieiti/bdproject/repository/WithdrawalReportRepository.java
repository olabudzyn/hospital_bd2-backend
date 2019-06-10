package com.isieiti.bdproject.repository;

import com.isieiti.bdproject.entity.WithdrawalReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WithdrawalReportRepository extends JpaRepository<WithdrawalReport, Long> {
}
