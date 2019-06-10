package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.RoomServiceDTO;
import com.isieiti.bdproject.dto.RoomServicePostDTO;
import com.isieiti.bdproject.entity.RoomServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class RoomServiceMapper {

    @Mappings({
            @Mapping(target = "technicianName", source = "roomServiceEntity.technician.name"),
            @Mapping(target = "technicianSurname", source = "roomServiceEntity.technician.surname"),
            @Mapping(target = "roomNumber", source = "roomServiceEntity.room.number"),
            @Mapping(target = "roomType", source = "roomServiceEntity.room.type")
    })
    public abstract RoomServiceDTO toRoomServiceDTO(RoomServiceEntity roomServiceEntity);

    @Mappings({
            @Mapping(target = "technicianId", source = "technician.id"),
            @Mapping(target = "roomId", source = "room.id")
    })
    public abstract RoomServicePostDTO toRoomServicePostDTO(RoomServiceEntity roomServiceEntity);

    public abstract List<RoomServiceDTO> toRoomServiceDTOs(List<RoomServiceEntity> roomServiceEntities);

    @Mappings({
            @Mapping(target = "technician.id", source = "technicianId"),
            @Mapping(target = "room.id", source = "roomId")
    })
    public abstract RoomServiceEntity toRoomService(RoomServicePostDTO roomServicePostDTO);
}
