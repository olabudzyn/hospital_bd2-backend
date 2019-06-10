package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.InstrumentService;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.InstrumentServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstrumentServiceService {

    private final InstrumentServiceRepository repository;

    public InstrumentService getSingleInstrumentService(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Instrument Service", "id", id));
    }

    public List<InstrumentService> getAllInstrumentService() {
        return repository.findAll();
    }

    public InstrumentService addInstruemntService(InstrumentService instrumentService) {
        return repository.save(instrumentService);
    }

    public void deleteInstruemntService(Long id) {
        repository.deleteById(id);
    }
}
