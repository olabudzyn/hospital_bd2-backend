package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.Technician;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.TechnicianRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechnicianService {

    private final TechnicianRepository repository;

    public Technician findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Technician", "id", id));
    }

    public List<Technician> getAllTechnicians(){
        return repository.findAll();
    }

    public Technician postTechnician(Technician technician){
        return repository.save(technician);
    }

    public void deleteTechnician(Long id){
        repository.deleteById(id);
    }
}
