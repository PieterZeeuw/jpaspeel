package nl.ocwduo.jpaspeeltuin.api;

import nl.ocwduo.jpaspeeltuin.entities.PersonEntity;
import nl.ocwduo.jpaspeeltuin.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    PersonRepo personRepo;

    @RequestMapping(path = "/personen", method = RequestMethod.GET)
    public ResponseEntity<List<PersonEntity>> getPersonen () {
        return ResponseEntity.ok(personRepo.findAll());
    }

    @RequestMapping(path = "/personen", method = RequestMethod.POST)
    public ResponseEntity<PersonEntity> nieuwPersoon(@RequestBody PersonEntity personEntity) {
        return ResponseEntity.ok(personRepo.save(personEntity));
    }
}
