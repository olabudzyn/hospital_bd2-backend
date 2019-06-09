package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.Room;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository repository;

    public Room findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ward", "id", id));
    }

    public List<Room> getAll() {
        return repository.findAll();
    }

    public Room addRoom(Room room) {
        return repository.save(room);
    }

    public void deleteRoom(Long id) {
        repository.deleteById(id);
    }
}
