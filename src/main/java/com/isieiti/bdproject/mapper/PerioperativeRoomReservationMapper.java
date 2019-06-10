package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.PerioperativeRoomReservationDTO;
import com.isieiti.bdproject.dto.PerioperativeRoomReservationPostDTO;
import com.isieiti.bdproject.entity.PerioperativeRoomReservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class PerioperativeRoomReservationMapper {

    @Mappings({
            @Mapping(target = "employeeName", source = "perioperativeRoomReservation.employee.name"),
            @Mapping(target = "employeeSurname", source = "perioperativeRoomReservation.employee.surname"),
            @Mapping(target = "employeeType", source = "perioperativeRoomReservation.employee.type"),
            @Mapping(target = "roomNumber", source = "perioperativeRoomReservation.room.roomNumber"),
            @Mapping(target = "bedsNumber", source = "perioperativeRoomReservation.room.bedsNumber")
    })
    public abstract PerioperativeRoomReservationDTO toPerioperativeRoomReservationDTO(PerioperativeRoomReservation perioperativeRoomReservation);

    @Mappings({
            @Mapping(target = "employeeId", source = "perioperativeRoomReservation.employee.id"),
            @Mapping(target = "roomId", source = "perioperativeRoomReservation.room.id")
    })
    public abstract PerioperativeRoomReservationPostDTO toPerioperativeRoomReservationPostDTO(PerioperativeRoomReservation perioperativeRoomReservation);

    public abstract List<PerioperativeRoomReservationDTO> toPerioperativeRoomReservationDTOs(List<PerioperativeRoomReservation> perioperativeRoomReservations);

    @Mappings({
            @Mapping(target = "room.id", source = "roomId"),
            @Mapping(target = "employee.id", source = "employeeId")
    })
    public abstract PerioperativeRoomReservation toPerioperativeRoomReservation(PerioperativeRoomReservationPostDTO perioperativeRoomReservationPostDTO);

}
