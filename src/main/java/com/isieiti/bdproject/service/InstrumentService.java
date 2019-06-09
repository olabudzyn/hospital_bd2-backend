package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.Instrument;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.InstrumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstrumentService {

    private final InstrumentRepository repository;

    public Instrument findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Instrument", "id", id));
    }

    public List<Instrument> getAll() {
        return repository.findAll();
    }

    public Instrument saveInstrument(Instrument instrument) {
        return repository.save(instrument);
    }

    public void deleteInstrument(Long id) {
        repository.deleteById(id);
    }
}
