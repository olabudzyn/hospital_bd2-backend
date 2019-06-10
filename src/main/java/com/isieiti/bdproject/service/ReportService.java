package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.Report;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository repository;

    public Report getSingleReport(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Report", "id", id));
    }

    public List<Report> getAllReports() {
        return repository.findAll();
    }

    public Report addReport(Report report) {
        return repository.save(report);
    }

    public void deleteReport(Long id) {
        repository.deleteById(id);
    }
}
