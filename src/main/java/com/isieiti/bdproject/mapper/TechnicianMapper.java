package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.TechnicianDTO;
import com.isieiti.bdproject.dto.TechnicianPostDTO;
import com.isieiti.bdproject.entity.Technician;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class TechnicianMapper {

    @Mappings({
            @Mapping(target = "serialNumber", source = "technician.instrument.serialNumber"),
            @Mapping(target = "instrumentType", source = "technician.instrument.type"),
            @Mapping(target =  "checkPeriod", source = "technician.instrument.checkPeriod"),
            @Mapping(target = "lastCheckTimestamp", source = "technician.instrument.lastCheckTimestamp")
    })
    public abstract TechnicianDTO toTechnicianDTO(Technician technician);

    @Mapping(target = "instrumentId", source = "instrument.id")
    public abstract TechnicianPostDTO toTechnicanPostDTO(Technician technician);

    public abstract List<TechnicianDTO> toTechnicianDTOs(List<Technician> technicians);

    @Mapping(target = "instrument.id", source = "instrumentId")
    public abstract Technician toTechnician(TechnicianPostDTO technicianPostDTO);
}
