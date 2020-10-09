package nl.ocwduo.jpaspeeltuin.repo;

import nl.ocwduo.jpaspeeltuin.entities.AdresEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdresRepo extends CrudRepository <AdresEntity, Long> {
    AdresEntity findByPersonId(Long personId);
}
