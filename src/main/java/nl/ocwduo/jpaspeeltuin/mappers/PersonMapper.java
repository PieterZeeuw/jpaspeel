package nl.ocwduo.jpaspeeltuin.mappers;

import nl.ocwduo.jpaspeeltuin.dto.PersonDto;
import nl.ocwduo.jpaspeeltuin.entities.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {AdresMapper.class})
public interface PersonMapper {

    @Mapping(target = "adresEntity", source = "adresDto")
    PersonEntity personDtoToPersonEntity(PersonDto source);


    @Mapping(target = "adresDto", source = "adresEntity")
    PersonDto personEntityToPersonDto(PersonEntity source);
}
