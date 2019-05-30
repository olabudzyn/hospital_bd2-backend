package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.RoomReservation;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.RoomReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RoomReservationService {

    private RoomReservationRepository repository;

    //public RoomReservationService() {
    //}

//    public RoomReservationService(RoomReservationRepository repository) {
//        this.repository = repository;
//    }

    public RoomReservation findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ward", "id", id));
    }

    public List<RoomReservation> getAllRoomReservations(){
        return repository.findAll();
    }

    public RoomReservation saveRoomReservation(RoomReservation roomReservation){
        return repository.save(roomReservation);
    }

    public void deleteRoomReservation(Long id){
        repository.deleteById(id);
    }
}
