package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.WithdrawalReport;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.WithdrawalReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WithdrawalReportService {

    private final WithdrawalReportRepository repository;

    public WithdrawalReport findById(Long id){
        return repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("WithdrawalReport", "id", id));
    }

    public List<WithdrawalReport> getWithdrawalReports(){
        return repository.findAll();
    }

    public WithdrawalReport postWithdrawalReport(WithdrawalReport withdrawalReport){
        return repository.save(withdrawalReport);
    }

    public void deleteWithdrawalReport(Long id){
        repository.deleteById(id);
    }
}
