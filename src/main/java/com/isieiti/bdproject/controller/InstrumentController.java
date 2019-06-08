package com.isieiti.bdproject.controller;

import com.isieiti.bdproject.dto.InstrumentDTO;
import com.isieiti.bdproject.mapper.InstrumentMapper;
import com.isieiti.bdproject.service.InstrumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instruments")
@RequiredArgsConstructor
public class InstrumentController {

    private final InstrumentService service;

    private final InstrumentMapper mapper;

    @GetMapping
    public List<InstrumentDTO> getInstruments() {
        return mapper.toInstrumentDTOs(service.getAll());
    }

    @PostMapping
    public InstrumentDTO postInstrument(@RequestBody InstrumentDTO instrumentDTO) {
        return mapper.toInstrumentDTO(service.saveInstrument(mapper.toInstrument(instrumentDTO)));
    }
}
