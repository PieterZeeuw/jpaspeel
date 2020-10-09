package nl.ocwduo.jpaspeeltuin.repo;

import nl.ocwduo.jpaspeeltuin.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo extends CrudRepository <PersonEntity, Long> {

    List<PersonEntity> findAll();
}
