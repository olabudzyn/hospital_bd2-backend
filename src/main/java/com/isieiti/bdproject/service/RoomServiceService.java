package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.RoomServiceEntity;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.RoomServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceService {

    private final RoomServiceRepository repository;

    public RoomServiceEntity getSingleRoomService(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RoomService", "id", id));
    }

    public List<RoomServiceEntity> getAllRoomServices() {
        return repository.findAll();
    }

    public RoomServiceEntity addRoomService(RoomServiceEntity roomServiceEntity) {
        return repository.save(roomServiceEntity);
    }

    public void deleteRoomService(Long id) {
        repository.deleteById(id);
    }
}
