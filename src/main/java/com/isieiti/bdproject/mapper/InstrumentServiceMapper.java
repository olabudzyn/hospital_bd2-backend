package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.InstrumentServiceDTO;
import com.isieiti.bdproject.dto.InstrumentServicePostDTO;
import com.isieiti.bdproject.entity.InstrumentServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class InstrumentServiceMapper {

    @Mappings({
            @Mapping(target = "technicianName", source = "instrumentServiceEntity.technician.name"),
            @Mapping(target = "technicianSurname", source = "instrumentServiceEntity.technician.surname"),
            @Mapping(target = "serialNumber", source = "instrumentServiceEntity.instrument.serialNumber"),
            @Mapping(target = "instrumentType", source = "instrumentServiceEntity.instrument.type")
    })
    public abstract InstrumentServiceDTO toInstrumentServiceDTO(InstrumentServiceEntity instrumentServiceEntity);


    @Mappings({
            @Mapping(target = "technicianId", source = "technician.id"),
            @Mapping(target = "instrumentId", source = "instrument.id")
    })
    public abstract InstrumentServicePostDTO toInstrumentServicePostDTO(InstrumentServiceEntity instrumentServiceEntity);


    public abstract List<InstrumentServiceDTO> toInstrumentServiceDTOs(List<InstrumentServiceEntity> instrumentServiceEntity);

    @Mappings({
            @Mapping(target = "technician.id", source = "technicianId"),
            @Mapping(target = "instrument.id", source = "instrumentId")
    })
    public abstract InstrumentServiceEntity toInstrumentServiceEntity(InstrumentServicePostDTO instrumentServicePostDTO);
}
