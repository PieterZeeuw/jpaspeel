package nl.ocwduo.jpaspeeltuin.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class PersonEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lastName;
    private String firstName;
    private String dateOfBirth;

    @OneToOne(mappedBy = "personEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private AdresEntity adresEntity;
}
