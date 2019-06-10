package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.RoomServiceDTO;
import com.isieiti.bdproject.dto.RoomServicePostDTO;
import com.isieiti.bdproject.entity.RoomService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class RoomServiceMapper {

    @Mappings({
            @Mapping(target = "technicianName", source = "roomService.technician.name"),
            @Mapping(target = "technicianSurname", source = "roomService.technician.surname"),
            @Mapping(target = "roomNumber", source = "roomService.room.number"),
            @Mapping(target = "roomType", source = "roomService.room.type")
    })
    public abstract RoomServiceDTO toRoomServiceDTO(RoomService roomService);

    @Mappings({
            @Mapping(target = "technicianId", source = "technician.id"),
            @Mapping(target = "roomId", source = "room.id")
    })
    public abstract RoomServicePostDTO toRoomServicePostDTO(RoomService roomService);

    public abstract List<RoomServiceDTO> toRoomServiceDTOs(List<RoomService> roomServices);

    @Mappings({
            @Mapping(target = "technician.id", source = "technicianId"),
            @Mapping(target = "room.id", source = "roomId")
    })
    public abstract RoomService toRoomService(RoomServicePostDTO roomServicePostDTO);
}
