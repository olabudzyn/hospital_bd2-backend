package com.isieiti.bdproject.service;

import com.isieiti.bdproject.entity.Room;
import com.isieiti.bdproject.exception.ResourceNotFoundException;
import com.isieiti.bdproject.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomService {

    private RoomRepository repository;

   // public RoomService(RoomRepository repository) {
     //   this.repository = repository;
    //}

    public Room findById(Long id){
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ward", "id", id));
    }
}
