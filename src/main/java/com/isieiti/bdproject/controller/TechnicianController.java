package com.isieiti.bdproject.controller;

import com.isieiti.bdproject.dto.TechnicianDTO;
import com.isieiti.bdproject.dto.TechnicianPostDTO;
import com.isieiti.bdproject.entity.Instrument;
import com.isieiti.bdproject.entity.Technician;
import com.isieiti.bdproject.mapper.TechnicianMapper;
import com.isieiti.bdproject.service.InstrumentService;
import com.isieiti.bdproject.service.TechnicianService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/technician")
public class TechnicianController {

    private final TechnicianMapper mapper;
    private final TechnicianService technicianService;
    private final InstrumentService instrumentService;

    @GetMapping("/{id}")
    public TechnicianDTO getTechnician(@PathVariable Long id){
        return mapper.toTechnicianDTO(technicianService.findById(id));
    }

    @GetMapping
    public List<TechnicianDTO> getAllTechnicians(){
        return mapper.toTechnicianDTOs(technicianService.getAllTechnicians());
    }

    @PostMapping
    public TechnicianPostDTO postTechnician(@RequestBody TechnicianPostDTO technicianPostDTO){
        Instrument instrument = instrumentService.findById(technicianPostDTO.getInstrumentId());
        Technician technician = mapper.toTechnician(technicianPostDTO);
        technician.setInstrument(instrument);
        return mapper.toTechnicanPostDTO(technicianService.postTechnician(technician));
    }

    @DeleteMapping
    public void deleteTechnician(@PathVariable Long id){
        technicianService.deleteTechnician(id);
    }
}
