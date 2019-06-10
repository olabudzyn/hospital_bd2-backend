package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.PerioperativeRoomReservation;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.PerioperativeRoomReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PerioperativeRoomReservationService {

    private final PerioperativeRoomReservationRepository repository;

    public PerioperativeRoomReservation findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("PerioperativeRoomReservation", "id", id));
    }

    public List<PerioperativeRoomReservation> getAllPerioperativeRoomReservations() {
        return repository.findAll();
    }

    public PerioperativeRoomReservation postPerioperativeRoomReservation(PerioperativeRoomReservation perioperativeRoomReservation) {
        return repository.save(perioperativeRoomReservation);
    }

    public void deletePerioperativeRoomReservation(Long id) {
        repository.deleteById(id);
    }
}
