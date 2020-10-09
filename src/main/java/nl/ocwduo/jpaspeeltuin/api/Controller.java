package nl.ocwduo.jpaspeeltuin.api;

import lombok.extern.slf4j.Slf4j;
import nl.ocwduo.jpaspeeltuin.dto.AdresDto;
import nl.ocwduo.jpaspeeltuin.dto.PersonDto;
import nl.ocwduo.jpaspeeltuin.mappers.AdresMapper;
import nl.ocwduo.jpaspeeltuin.mappers.PersonMapper;
import nl.ocwduo.jpaspeeltuin.repo.AdresRepo;
import nl.ocwduo.jpaspeeltuin.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@Slf4j
public class Controller {
    @Autowired
    PersonRepo personRepo;

    @Autowired
    AdresRepo adresRepo;

    @RequestMapping(path = "/personen", method = RequestMethod.GET)
    public ResponseEntity<List<PersonDto>> getPersonen () {
        return ResponseEntity.ok(personRepo.findAll().stream().map(PersonMapper.INSTANCE::personEntityToPersonDto).collect(Collectors.toList()));
    }

    @RequestMapping(path = "/personen", method = RequestMethod.POST)
    public ResponseEntity<PersonDto> nieuwPersoon(@RequestBody PersonDto body) {
        log.info(body.toString());
        return ResponseEntity.ok(
                PersonMapper.INSTANCE.personEntityToPersonDto(
                        personRepo.save(
                                PersonMapper.INSTANCE.personDtoToPersonEntity(body)
                        )
                )
        );
    }

    @RequestMapping(path = "/personen/{personId}/adres", method = RequestMethod.GET)
    public ResponseEntity<AdresDto> getAdres(@PathVariable("personId") Long personId) {
        return ResponseEntity.ok(
                AdresMapper.INSTANCE.adresEntityToAdresDto(
                        adresRepo.findByPersonId(personId)
                )
        );
    }

}
