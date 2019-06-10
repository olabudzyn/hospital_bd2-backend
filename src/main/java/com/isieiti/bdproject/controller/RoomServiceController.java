package com.isieiti.bdproject.controller;

import com.isieiti.bdproject.dto.RoomServiceDTO;
import com.isieiti.bdproject.dto.RoomServicePostDTO;
import com.isieiti.bdproject.entity.Room;
import com.isieiti.bdproject.entity.RoomServiceEntity;
import com.isieiti.bdproject.entity.Technician;
import com.isieiti.bdproject.mapper.RoomServiceMapper;
import com.isieiti.bdproject.service.RoomService;
import com.isieiti.bdproject.service.RoomServiceService;
import com.isieiti.bdproject.service.TechnicianService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/room_service")
public class RoomServiceController {

    private final RoomServiceMapper mapper;
    private final RoomServiceService roomServiceService;
    private final TechnicianService technicianService;
    private final RoomService roomService;

    @GetMapping("/{id}")
    public RoomServiceDTO getRoomService(@PathVariable Long id) {
        return mapper.toRoomServiceDTO(roomServiceService.getSingleRoomService(id));
    }

    @GetMapping
    public List<RoomServiceDTO> getAllRoomServices() {
        return mapper.toRoomServiceDTOs(roomServiceService.getAllRoomServices());
    }

    @PostMapping
    public RoomServicePostDTO addRoomService(@RequestBody RoomServicePostDTO roomServicePostDTO) {
        Technician technician = technicianService.findById(roomServicePostDTO.getTechnicianId());
        Room room = roomService.findById(roomServicePostDTO.getRoomId());
        RoomServiceEntity service = mapper.toRoomService(roomServicePostDTO);
        service.setTechnician(technician);
        service.setRoom(room);
        return mapper.toRoomServicePostDTO(roomServiceService.addRoomService(service));
    }

    @DeleteMapping("/{id}")
    public void deleteRoomService(@PathVariable Long id) {
        roomServiceService.deleteRoomService(id);
    }

}
