package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.RoomReservation;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.RoomReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomReservationService {

    final private RoomReservationRepository repository;

    public RoomReservation findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RoomReservation", "id", id));
    }

    public List<RoomReservation> getAllRoomReservations() {
        return repository.findAll();
    }

    public RoomReservation saveRoomReservation(RoomReservation roomReservation) {
        return repository.save(roomReservation);
    }

    public void deleteRoomReservation(Long id) {
        repository.deleteById(id);
    }
}
