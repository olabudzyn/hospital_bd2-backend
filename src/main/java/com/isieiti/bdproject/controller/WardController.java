package com.isieiti.bdproject.controller;

import com.isieiti.bdproject.dto.WardDTO;
import com.isieiti.bdproject.mapper.WardMapper;
import com.isieiti.bdproject.service.WardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/wards")
@CrossOrigin(origins = "http://localhost:4200")
public class WardController {

    private final WardService service;
    private final WardMapper mapper;

    @GetMapping
    public List<WardDTO> getAllWards() {
        return mapper.toWardDTOs(service.getAllWards());
    }
}
