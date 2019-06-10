package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.InstrumentServiceDTO;
import com.isieiti.bdproject.dto.InstrumentServicePostDTO;
import com.isieiti.bdproject.entity.InstrumentService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class InstrumentServiceMapper {

    @Mappings({
            @Mapping(target = "technicianName", source = "instrumentService.technician.name"),
            @Mapping(target = "technicianSurname", source = "instrumentService.technician.surname"),
            @Mapping(target = "serialNumber", source = "instrumentService.instrument.serialNumber"),
            @Mapping(target = "instrumentType", source = "instrumentService.instrument.type")
    })
    public abstract InstrumentServiceDTO toInstrumentServiceDTO(InstrumentService instrumentService);


    @Mappings({
            @Mapping(target = "technicianId", source = "technician.id"),
            @Mapping(target = "instrumentId", source = "instrument.id")
    })
    public abstract InstrumentServicePostDTO toInstrumentServicePostDTO(InstrumentService instrumentService);


    public abstract List<InstrumentServiceDTO> toInstrumentServiceDTOs(List<InstrumentService> instrumentService);

    @Mappings({
            @Mapping(target = "technician.id", source = "technicianId"),
            @Mapping(target = "instrument.id", source = "instrumentId")
    })
    public abstract InstrumentService toInstrumentService(InstrumentServicePostDTO instrumentServicePostDTO);
}
