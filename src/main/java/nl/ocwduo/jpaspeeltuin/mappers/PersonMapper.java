package nl.ocwduo.jpaspeeltuin.mappers;

import nl.ocwduo.jpaspeeltuin.dto.PersonDto;
import nl.ocwduo.jpaspeeltuin.entities.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {AdresMapper.class})
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "adresEntity", source = "adresDto")
    PersonEntity personDtoToPersonEntity(PersonDto source);


    @Mapping(target = "adresDto", source = "adresEntity")
    PersonDto personEntityToPersonDto(PersonEntity source);
}
