package com.isieiti.bdproject.mapper;

import com.isieiti.bdproject.dto.InstrumentDTO;
import com.isieiti.bdproject.entity.Instrument;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InstrumentMapper {

    List<InstrumentDTO> toInstrumentDTOs(List<Instrument> instruments);

    InstrumentDTO toInstrumentDTO(Instrument instrument);

}
