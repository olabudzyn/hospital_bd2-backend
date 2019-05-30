package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.InstrumentReservationDTO;
import com.isieiti.bdproject.dto.InstrumentReservationPostDTO;
import com.isieiti.bdproject.entity.InstrumentReservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class InstrumentReservationMapper {

    @Mappings({
            @Mapping(target = "employeeName", source = "instrumentReservation.employee.name"),
            @Mapping(target = "employeeSurname", source = "instrumentReservation.employee.surname"),
            @Mapping(target = "employeeType", source = "instrumentReservation.employee.type"),
            @Mapping(target = "serialNumber", source = "instrumentReservation.instrument.serialNumber"),
            @Mapping(target = "instrumentType", source = "instrumentReservation.instrument.type")
    })
    public abstract InstrumentReservationDTO toInstrumentReservationDTO(InstrumentReservation instrumentReservation);

    @Mappings({
            @Mapping(target = "employeeId", source = "instrumentReservation.employee.id"),
            @Mapping(target = "instrumentId",source = "instrumentReservation.instrument.id")
    })
    public abstract InstrumentReservationPostDTO toInstrumentReservationPostDTO(InstrumentReservation instrumentReservation);

    public abstract List<InstrumentReservationDTO> toInstrumentReservationDTOs(List<InstrumentReservation> instrumentReservations);

    @Mappings({
            @Mapping(target = "employee.id", source = "employeeId"),
            @Mapping(target = "instrument.id", source = "instrumentId")
    })
    public abstract InstrumentReservation toInstrumentReservation(InstrumentReservationPostDTO instrumentReservationPostDTO);
}
