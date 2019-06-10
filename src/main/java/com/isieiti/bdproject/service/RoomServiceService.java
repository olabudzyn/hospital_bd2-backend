package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.RoomService;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.RoomServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceService {

    private final RoomServiceRepository repository;

    public RoomService getSingleRoomService(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("RoomSerivice", "id", id));
    }

    public List<RoomService> getAllRoomServices() {
        return repository.findAll();
    }

    public RoomService addRoomService(RoomService roomService) {
        return repository.save(roomService);
    }

    public void deleteRoomService(Long id) {
        repository.deleteById(id);
    }
}
