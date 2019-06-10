package com.isieiti.bdproject.controller;

import com.isieiti.bdproject.dto.InstrumentServiceDTO;
import com.isieiti.bdproject.dto.InstrumentServicePostDTO;
import com.isieiti.bdproject.entity.Instrument;
import com.isieiti.bdproject.entity.InstrumentServiceEntity;
import com.isieiti.bdproject.entity.Technician;
import com.isieiti.bdproject.mapper.InstrumentServiceMapper;
import com.isieiti.bdproject.service.InstrumentService;
import com.isieiti.bdproject.service.InstrumentServiceService;
import com.isieiti.bdproject.service.TechnicianService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/instrument_service")
public class InstrumentServiceController {

    public final InstrumentServiceMapper mapper;
    public final TechnicianService technicianService;
    public final InstrumentServiceService instrumentServiceService;
    public final InstrumentService instrumentService;

    @GetMapping("/{id}")
    public InstrumentServiceDTO getInstrumentService(@PathVariable Long id) {
        return mapper.toInstrumentServiceDTO(instrumentServiceService.getSingleInstrumentService(id));
    }

    @GetMapping
    public List<InstrumentServiceDTO> getAllInstrumentServices() {
        return mapper.toInstrumentServiceDTOs(instrumentServiceService.getAllInstrumentService());
    }

    @PostMapping
    public InstrumentServicePostDTO addInstrumentService(@RequestBody InstrumentServicePostDTO instrumentServicePostDTO) {
        Technician technician = technicianService.findById(instrumentServicePostDTO.getTechnicianId());
        Instrument instrument = instrumentService.findById(instrumentServicePostDTO.getInstrumentId());
        InstrumentServiceEntity serviceEntity = mapper.toInstrumentServiceEntity(instrumentServicePostDTO);
        serviceEntity.setInstrument(instrument);
        serviceEntity.setTechnician(technician);
        return mapper.toInstrumentServicePostDTO(instrumentServiceService.addInstrumentService(serviceEntity));
    }

    @DeleteMapping("/{id}")
    public void deleteInstrumentService(@PathVariable Long id) {
        instrumentServiceService.deleteInstrumentService(id);
    }
}
