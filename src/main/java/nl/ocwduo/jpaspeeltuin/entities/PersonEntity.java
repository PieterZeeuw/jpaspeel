package nl.ocwduo.jpaspeeltuin.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Data
@Entity
public class PersonEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String lastName;
    private String firstName;
    private String dateOfBirth;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "personId")
    private List<AdresEntity> adresEntity;

    public AdresEntity getAdresEntity() {
        return adresEntity.size() > 0 ? adresEntity.get(0) : null;
    }

    public void setAdresEntity(AdresEntity adresEntity) {
        this.adresEntity = Collections.singletonList(adresEntity);
    }
}
