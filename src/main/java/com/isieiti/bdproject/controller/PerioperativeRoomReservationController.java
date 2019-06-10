package com.isieiti.bdproject.controller;

import com.isieiti.bdproject.dto.PerioperativeRoomReservationDTO;
import com.isieiti.bdproject.dto.PerioperativeRoomReservationPostDTO;
import com.isieiti.bdproject.entity.Employee;
import com.isieiti.bdproject.entity.PerioperativeRoom;
import com.isieiti.bdproject.entity.PerioperativeRoomReservation;
import com.isieiti.bdproject.mapper.PerioperativeRoomReservationMapper;
import com.isieiti.bdproject.service.EmployeeService;
import com.isieiti.bdproject.service.PerioperativeRoomReservationService;
import com.isieiti.bdproject.service.PerioperativeRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/perioperative_room_reservation")
public class PerioperativeRoomReservationController {

    private final PerioperativeRoomReservationMapper mapper;
    private final EmployeeService employeeService;
    private final PerioperativeRoomService perioperativeRoomService;
    private final PerioperativeRoomReservationService perioperativeRoomReservationService;

    @GetMapping("/{id}")
    public PerioperativeRoomReservationDTO getPerioperativeRoomReservation(@PathVariable Long id){
        return mapper.toPerioperativeRoomReservationDTO(perioperativeRoomReservationService.findById(id));
    }

    @GetMapping
    public List<PerioperativeRoomReservationDTO> getPerioperativeRoomReservation(){
        return mapper.toPerioperativeRoomReservationDTOs(perioperativeRoomReservationService.getAllPerioperativeRoomReservations());
    }

    @PostMapping
    public PerioperativeRoomReservationPostDTO postPerioperativeRoomReservation(@RequestBody PerioperativeRoomReservationPostDTO perioperativeRoomReservationPostDTO){
        Employee employee = employeeService.getSingleEmployee(perioperativeRoomReservationPostDTO.getEmployeeId());
        PerioperativeRoom perioperativeRoom = perioperativeRoomService.findById(perioperativeRoomReservationPostDTO.getRoomId());
        PerioperativeRoomReservation perioperativeRoomReservation = mapper.toPerioperativeRoomReservation(perioperativeRoomReservationPostDTO);
        perioperativeRoomReservation.setEmployee(employee);
        perioperativeRoomReservation.setRoom(perioperativeRoom);
        return mapper.toPerioperativeRoomReservationPostDTO(perioperativeRoomReservationService
                .postPerioperativeRoomReservation(perioperativeRoomReservation));
    }

    @DeleteMapping("/{id}")
    public void deletePerioperativeRoomReservation(@PathVariable Long id){
        perioperativeRoomReservationService.deletePerioperativeRoomReservation(id);
    }
}
