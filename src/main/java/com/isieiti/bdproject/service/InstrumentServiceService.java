package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.InstrumentServiceEntity;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.InstrumentServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstrumentServiceService {

    private final InstrumentServiceRepository repository;

    public InstrumentServiceEntity getSingleInstrumentService(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Instrument Service", "id", id));
    }

    public List<InstrumentServiceEntity> getAllInstrumentService() {
        return repository.findAll();
    }

    public InstrumentServiceEntity addInstrumentService(InstrumentServiceEntity instrumentServiceEntity) {
        return repository.save(instrumentServiceEntity);
    }

    public void deleteInstrumentService(Long id) {
        repository.deleteById(id);
    }
}
