package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.InstrumentReservation;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.InstrumentReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstrumentReservationService {

    private final InstrumentReservationRepository repository;

    public InstrumentReservation findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Instrument Reservation", "id", id));
    }

    public List<InstrumentReservation> getAllInstrumentReservations() {
        return repository.findAll();
    }

    public InstrumentReservation postInstrumentReservation(InstrumentReservation instrumentReservation) {
        return repository.save(instrumentReservation);
    }

    public void deleteInstrumentReservation(Long id) {
        repository.deleteById(id);
    }
}
