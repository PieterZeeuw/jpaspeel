package nl.ocwduo.jpaspeeltuin.mappers;

import nl.ocwduo.jpaspeeltuin.dto.AdresDto;
import nl.ocwduo.jpaspeeltuin.entities.AdresEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AdresMapper {
    AdresMapper INSTANCE = Mappers.getMapper(AdresMapper.class);

    AdresEntity adresDtoToAdresEntity(AdresDto source);
    AdresDto adresEntityToAdresDto(AdresEntity source);
}
